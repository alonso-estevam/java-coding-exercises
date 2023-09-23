package exercism;

// From: https://exercism.org/tracks/java/exercises/micro-blog

public class _007_MicroBlog {
    public static void main(String[] args) {
        String input = "abc😀😀efgh";

        System.out.println(truncate(input));
    }
    public static String truncate(String input) {
        return input.codePoints()
                .limit(5)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint,
                StringBuilder::append)
                .toString();
    }
}
