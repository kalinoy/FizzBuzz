import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    
    private static final int ARRAY_SIZE=100;  
    
    
    public List<String> getFizzBuzzArray(){
        List<String> initialFizzBuzzArray=getInitialFizzBuzzArray(ARRAY_SIZE);
        List<String> fizzBuzzArray=new ArrayList<>();
        initialFizzBuzzArray.stream().forEach(value->fizzBuzzArray.add(FizzBuzzValue.getFizzBuzzValue(value)));
        return fizzBuzzArray;
    }
    
    private List<String> getInitialFizzBuzzArray(int arraySize){
        List<String> initialFizzBuzzArray=new ArrayList<>();
        for(int i=1;i<=arraySize;i++){
            initialFizzBuzzArray.add(String.valueOf(i));
        }
        return initialFizzBuzzArray;
    }
}
