package exercism;

// From: https://exercism.org/tracks/java/exercises/squeaky-clean
/*  In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is
    comprised of zero or more letters and underscores.
    In all cases the input string is guaranteed to be non-null.
    Note that the clean method should treat an empty string as valid.
 */
public class _005_SqueakyClean {
    public static void main(String[] args) {

        String result = SqueakyClean.clean("myβιεγτFinder\0Id à-Ḃç ωa1\uD83D");
        System.out.println(result);

    }
    static class SqueakyClean {
        static String clean(String identifier) {
            StringBuilder output = new StringBuilder();
            boolean prevHyphen = false;
            // Another way to iterate with a for each loop on identifier.toCharArray().
            for (char ch : identifier.toCharArray()) {
                if (Character.isLetter(ch) && (ch < 'α' || ch > 'ω')) {
                    /* Instead of replacing characters in another String, which is computationally
                     expensive, append qualifying characters to a StringBuilder. */
                    output.append(!prevHyphen ? ch : Character.toUpperCase(ch));
                } else if (ch == ' ') {
                    output.append("_");
                } else if (Character.isISOControl(ch)) {
                    output.append("CTRL");
                }
                prevHyphen = ch == '-';
            }
            return output.toString();
        }
    }
}

