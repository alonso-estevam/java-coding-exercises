package codewars;

public class DigitalRoot {
    public static void main(String[] args) {
        int number = 942;

        System.out.println(recursiveSum(number));

    }
    public static int recursiveSum(int number){
        final String numbers = String.valueOf(number);
        final int digits = numbers.length();
        int sum = Character.getNumericValue(numbers.charAt(0));
        for(int i = 1; i < digits; i++) {
            sum += Character.getNumericValue(numbers.charAt(i));
        }

        if(sum > 9) {
            return recursiveSum(sum);
        } else {
            return sum;
        }
    }

}
