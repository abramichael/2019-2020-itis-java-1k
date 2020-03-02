public class MyMath {
    public static int fact(int n) {
        if (n < 0) {
            throw new ArithmeticException("Fact can't be counted from -1");
        }
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }


    public static int sqr(int x) {
        return x * x;
    }


}
