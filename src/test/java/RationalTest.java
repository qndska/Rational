import org.junit.Assert;
import org.junit.Test;

public class RationalTest {

    @Test
    public void testDefaultConstructor() {
        Rational r = new Rational();
        Assert.assertEquals(0, r.numerator);
        Assert.assertEquals(1, r.denominator);
    }

    @Test
    public void testParameterizedConstructor() throws Rational.Illegal {
        Rational r = new Rational(3, 4);
        Assert.assertEquals(3, r.numerator);
        Assert.assertEquals(4, r.denominator);
    }

    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }

    @Test
    public void testSubtract() throws Rational.Illegal {
        Rational x = new Rational(3, 4);
        Rational y = new Rational(1, 2);
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testMultiply() throws Rational.Illegal {
        Rational x = new Rational(2, 3);
        Rational y = new Rational(3, 4);
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    @Test
    public void testDivide() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(3, 4);
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }

    @Test
    public void testEquals() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 4);
        Rational z = new Rational(3, 4);
        Assert.assertTrue(x.equals(y));
        Assert.assertFalse(x.equals(z));
    }

    @Test
    public void testCompareTo() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 4);
        Rational z = new Rational(3, 4);
        Assert.assertEquals(0, x.compareTo(y));
        Assert.assertTrue(x.compareTo(z) < 0);
        Assert.assertTrue(z.compareTo(x) > 0);
    }

    @Test
    public void testToString() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(-3, 4);
        Rational z = new Rational(0, 5);
        Assert.assertEquals("1/2", x.toString());
        Assert.assertEquals("-3/4", y.toString());
        Assert.assertEquals("0/1", z.toString());
    }
}
