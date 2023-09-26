package codewars;

public class DigitalRoot {
    public static void main(String[] args) {
        int number = 16;
        System.out.println(recursiveSum(number));

    }
    public static int recursiveSum(int number){
        char[] digits = getCharArrayFromInt(number);
        int sum = 0;
        while(digits.length > 1){
            for (int i = 0; i < digits.length; i++) {
                sum = sum + (int) digits[i];
            }
            digits = getCharArrayFromInt(sum);
        }
        return sum;
    }

    public static char[] getCharArrayFromInt(int number){
        String numberString = String.valueOf(number);
        return numberString.toCharArray();
    }
}
