public class Task1 {
	
	public static void main(String [] args) {
		
		double x = Double.parseDouble(args[0]);
		int n = Integer.parseInt(args[1]);
		
		double s = 1; // case of k = 0
		
		int k = 1;
		double deg = 1;
		int fact = 1;
		double a;
		while (k <= n) {
			deg *= x;
			fact *= k;
			a = deg / fact;
			s += a;
			k += 1;
			System.out.println(s);
		}
		
		System.out.println(s);
		
		
	}
	
}