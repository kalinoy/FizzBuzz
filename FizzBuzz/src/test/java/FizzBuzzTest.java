import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {
    
    private static List<String> fizzBuzzArray =new ArrayList<>();

    @BeforeClass
    public static void init(){
        FizzBuzz fizzBuzz =new FizzBuzz();
        fizzBuzzArray= fizzBuzz.getFizzBuzzArray();
    }
    
    @Test
    public void isValidArraySizeTest(){
        Assert.assertTrue(fizzBuzzArray.size()==100);
    }
    
    @Test
    public void arrayValueFizzTest(){
        fizzBuzzArray.stream().forEach(i-> {
            if (isArrayIndexDivideInNumber(i, 3) && !isArrayIndexDivideInNumber(i, 5)) {
                Assert.assertEquals(i,"Fizz");
            }
        });
    }
    
    @Test
    public void arrayValueBuzzTest(){
        fizzBuzzArray.stream().forEach(i-> {
            if (isArrayIndexDivideInNumber(i, 5) && !isArrayIndexDivideInNumber(i, 3)) {
                Assert.assertEquals(i,"Buzz");
            }
        });
    }
    
    @Test
    public void arrayFizzBuzzTest(){
        fizzBuzzArray.stream().forEach(i-> {
            if (isArrayIndexDivideInNumber(i, 3) && isArrayIndexDivideInNumber(i, 5)) {
                Assert.assertEquals(i,"FizzBuzz");
            }
        });
    }
    
    private boolean isArrayIndexDivideInNumber(String index, int dividedNumber) {
        return (fizzBuzzArray.indexOf(index) + 1) % dividedNumber == 0;
    }
}
