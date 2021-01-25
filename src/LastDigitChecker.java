public class LastDigitChecker {

    public static boolean hasSameLastDigit (int num1, int num2, int num3){
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        int one = num1 % 10;
        int two = num2 % 10;
        int three = num3 % 10;
        return ((one == two) || (one == three)) || (two == three);
    }

    public static boolean isValid(int param){
        if (param >= 10 && param <= 1000){
            return true;
        }
        return false;
    }
}
