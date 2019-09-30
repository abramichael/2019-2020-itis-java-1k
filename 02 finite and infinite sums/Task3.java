public class Task3 {
	
	public static void main(String [] args) {
		double x = 10;
		double y;
		long c1, c2;
		double p = 1;
		int n = 7;
		int i;
		
		c1 = System.nanoTime();
		for (i = 1; i <= n; i++) {
			p = p * x;
		}
		c2 = System.nanoTime();
		System.out.println(c2 - c1);
		
		c1 = System.nanoTime();
		y = Math.pow(x, n);
		c2 = System.nanoTime();
		System.out.println(c2 - c1);
		
	}
	
}