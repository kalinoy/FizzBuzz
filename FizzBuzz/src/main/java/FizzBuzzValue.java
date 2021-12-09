public class FizzBuzzValue {
    
    public static String getFizzBuzzValue(String number) {
        int convertedIntNumber = Integer.parseInt(number);
        if (isFizzValue(convertedIntNumber) && isBuzzValue(convertedIntNumber)) {
            return "FizzBuzz";
        }
        if (isFizzValue(convertedIntNumber)) {
            return "Fizz";
        }
        if (isBuzzValue(convertedIntNumber)) {
            return "Buzz";
        }
        return number;
    }
    
    private static boolean isFizzValue(int number) {
        return number % 3 == 0;
    }
    
    private static boolean isBuzzValue(int number) {
        return number % 5 == 0;
    }
}
