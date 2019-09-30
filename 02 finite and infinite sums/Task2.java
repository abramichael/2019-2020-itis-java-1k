public class Task2 {
	
	public static void main(String [] args) {
		double x = 10;
		double y;
		long c1, c2;
		
		c1 = System.nanoTime();
		y = x * x;
		c2 = System.nanoTime();
		System.out.println(c2 - c1);
		
		c1 = System.nanoTime();
		y = Math.pow(x, 2);
		c2 = System.nanoTime();
		System.out.println(c2 - c1);
		
		
		
		
	}
	
}