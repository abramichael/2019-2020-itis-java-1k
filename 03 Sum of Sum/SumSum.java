public class SumSum {
	

	public static void main(String [] args) {
		
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		
		if (m > n) {
			int h = m;
			m = n;
			n = h;
		}
		
		long f = 1;
		long s = 0;
		for (int i = 1; i <= m; i++) {
			f *= i;
			s += f;
		}
		s *= (m + n);
		long s2 = 0;
		for (int i = m + 1; i <= n; i++){
			f *= i;
			s2 += f;
		}
		s2 *= m;
		s += s2;
		System.out.println(s);

	}
	
}