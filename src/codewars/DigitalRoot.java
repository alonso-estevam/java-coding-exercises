package codewars;

public class DigitalRoot {
    public static void main(String[] args) {
        int number = 942;

        System.out.println(recursiveSum(number));

    }
    public static int recursiveSum(int number){
        if (number < 10) {
            return number;
        }
        return recursiveSum(number % 10 + recursiveSum(number / 10));
    }

}
