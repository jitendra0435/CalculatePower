import org.junit.Assert;
import org.junit.Test;

public class CalculatePowerTest {

    @Test
    public void givenMethodForPowerOfNumberShouldReturnResult() {

        CalculatePower powerFunction=new CalculatePower();
        int result=powerFunction.getPowerOfNumber(2,3);
        Assert.assertEquals(result,8);

    }

    @Test
    public void givenMethodForIfNumberIsNotIntegerShouldReturnResult() {

        CalculatePower powerFunction=new CalculatePower();
        int result=powerFunction.getPowerOfNumber(-3,-2);
        Assert.assertNotEquals(result,9);
    }

    @Test
    public void givenMethodForIfNumberIsZeroShouldReturnResult() {

        CalculatePower powerFunction=new CalculatePower();
        int result=powerFunction.getPowerOfNumber(2,0);
        Assert.assertEquals(result,1);
    }
}
