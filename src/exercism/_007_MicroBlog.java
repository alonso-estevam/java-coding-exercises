package exercism;

public class _007_MicroBlog {
    public static void main(String[] args) {
        String input = "abc😀😀efgh";

        System.out.println(truncate(input));
    }
    public static String truncate(String input) {
        if(input.length() > 5){
            return input.substring(0,5);
        }
        return input;
    }
}
