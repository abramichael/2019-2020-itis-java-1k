import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

    @Test
    public void factFromZeroShouldBe1() {
        Assert.assertEquals(1, MyMath.fact(0));
    }

    @Test
    public void factFrom5is120() {
        Assert.assertEquals(120, MyMath.fact(5));
    }

    @Test(expected = ArithmeticException.class)
    public void checkThatFactOnNegativeThrowsException(){
        MyMath.fact(-1);
    }

    @Test
    public void sqrOf2ShouldBe4() {
        Assert.assertEquals(4, MyMath.sqr(2));
    }

}
