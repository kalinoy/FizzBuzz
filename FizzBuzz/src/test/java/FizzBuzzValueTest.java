import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class FizzBuzzValueTest {
    
    private static FizzBuzzValue fizzBuzzValue =new FizzBuzzValue();
    
    @Test
    @Parameters({
    "3","6","9","12"
    })
    public void fizzValueTest(String value){
        Assert.assertEquals(fizzBuzzValue.getFizzBuzzValue(value),"Fizz");
    }
    
    @Test
    @Parameters({
            "5","20","25","35"
    })
    public void buzzValueTest(String value){
        Assert.assertEquals(fizzBuzzValue.getFizzBuzzValue(value),"Buzz");
    }
    
    @Test
    @Parameters({
            "15","30","45","60"
    })
    public void fizzBuzzValueTest(String value){
        Assert.assertEquals(fizzBuzzValue.getFizzBuzzValue(value),"FizzBuzz");
    }
    
    @Test
    @Parameters({
            "1,1","2,2","4,4","7,7"
    })
    public void numberValueTest(String value,String expectedValue){
        Assert.assertEquals(fizzBuzzValue.getFizzBuzzValue(value),expectedValue);
    }
}
