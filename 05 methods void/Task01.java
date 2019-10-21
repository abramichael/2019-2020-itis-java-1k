public class Task01 {
	
	public static void newLine() {
		System.out.println();
	}
	
	public static void drawLine(String s, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(s);
		}
	}
	
	// ������������� ����������� ���� 2 � ������� n �� *
	public static void drawRightTriangle(String s, int a) {
		
		for (int i = 1; i <= a; i++) {
			drawLine(s, i);
			newLine();
		}
		
	}
	
	//� ������������� � ���������� n, ������� m
	public static void drawParallelogram(String s, int a, int b) {
		for (int i = 0; i < b; i++) {
			drawLine(" ", i);
			drawLine(s, a);
			newLine();
		}			
	}
	
	//� ������������� � ���������� n, ������� m
	public static void drawRectangle(String s, int a, int b) {
		
		for (int i = 0; i < b; i++) {
			drawLine(s, a);
			newLine();
		}		
		
	}
	
	public static void main(String [] args) {
		
		drawRightTriangle("*", 5);
		drawParallelogram("a", 10, 5);
		drawRectangle("0", 10, 5);
		
	}
	
}