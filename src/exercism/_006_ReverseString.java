package exercism;

// From: https://exercism.org/tracks/java/exercises/reverse-string
public class _006_ReverseString {
    public static void main(String[] args) {
        String input = "cool";
        System.out.println(reverse(input));

    }
    public static String reverse (String input){
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
