package unit_tests;

import Calculator.Calculator;
import org.junit.Test;
import org.testng.Assert;

public class PriorityTest extends BaseTest {

    private Calculator calculator;
    private final double FIRST_NUM = 10;
    private final double SECOND_NUM = 5;

    @Test(priority = 2, groups = "mult test")
    public void checkAdd() {
        double expectedResult = FIRST_NUM + SECOND_NUM;
        double actualResult = calculator.add(FIRST_NUM, SECOND_NUM);

        Assert.assertEquals(actualResult, expectedResult, "The result is not corrected for adding");
    }

    @Test(priority = 1)
    public void checkSecondMult() {
        double expectedResult = FIRST_NUM + SECOND_NUM;
        double actualResult = calculator.add(FIRST_NUM, SECOND_NUM);

        Assert.assertEquals(actualResult, expectedResult, "The result is not corrected for mult");
    }
}
