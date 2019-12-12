import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void process(String line, Figure [] figures, int n) {
		
		String [] data = line.split(" ");
		switch (data[0]) {
			
			case "rectangle":
				figures[n] = new Rectangle(
									Double.parseDouble(data[1]),
									Double.parseDouble(data[2])
								);
				break;
				
			case "triangle":
				figures[n] = new Triangle(
									Double.parseDouble(data[1]),
									Double.parseDouble(data[2]),
									Double.parseDouble(data[3])
								);
				break;
				
			case "circle":
				figures[n] = new Circle(Double.parseDouble(data[1]));
				break;
		}
		
	}
	
	public static int readFigures(String filename, Figure [] figures) {
		
		int n = 0;
		try { 
			Scanner sc = new Scanner(new File(filename));
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				process(line, figures, n);
				n++;				
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			return n;
		}
		
	}
	
	public static void main(String [] args) {
		
		// считать из файла фигуры
		
		final int CAPACITY = 1000;
		Figure [] figures = new Figure[CAPACITY];
		
		int n = readFigures("input.txt", figures);
		
		// найти общую площадь
		double s = 0;
		for (int i = 0; i < n; i++) {
			s += figures[i].square();
		}
		System.out.println("TOTAL SQUARE: " + s);
		
		// найти общий периметр
		double p = 0;
		for (int i = 0; i < n; i++) {
			p += figures[i].perimeter();
		}
		
		System.out.println("TOTAL PERIMETER: " + p);
				
		
		
	}
	
	
}