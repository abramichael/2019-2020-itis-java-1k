import java.util.Scanner;

public class TaskArray {
		
	public static void main(String [] args) {
		
		int n = 10;
		int [] a = new int[n];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int [] a = {1, 6, 3, 6};
		//int [] a = new int []{1, 6, 3, 6};
		
		for (int x : a) {
			System.out.println(x);
		}
		
		
	}
	
	
}