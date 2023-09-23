package exercism;

// From: https://exercism.org/tracks/java/exercises/reverse-string
public class _006_ReverseString {
    public static void main(String[] args) {
        String input = "cool";
        System.out.println(reverse(input));

    }
    public static String reverse (String input){
        return new StringBuilder(input).reverse().toString();
    }
}
