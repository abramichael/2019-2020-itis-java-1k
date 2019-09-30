public class InfinitySum {
	
	public static void main(String [] args) {
		
		double x = Double.parseDouble(args[0]);
		final double EPS = 1e-9; //0.000000001
		
		double s = 1; 
		int f = 1;
		double d = 1;
		double a = d / f;
		
		int k = 1;
		while (Math.abs(a) > EPS) {
			f *= k;
			d *= x;
			a = d / f;
			s += a;
			k += 1;
		}
		System.out.println(s);	
		
	}
	
}