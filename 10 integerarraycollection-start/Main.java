public class Main {
    public static void main(String[] args) {

        IntegerArrayCollection a = new IntegerArrayCollection();
        a.add(10);
        a.add(20);
        System.out.println(a.size());
        a.remove(20);
        IntegerArrayCollection a2 =
                new IntegerArrayCollection();
        a2.add(30);
        a.addAll(a2);

    }
}
