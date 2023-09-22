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
            for (int i = 0; i < identifier.length(); i++) {
                if(Character.isISOControl(identifier.charAt(i))) {
                    identifier = identifier.replace(String.valueOf(identifier.charAt(i)), "CTRL");
                }
            }

            return convertKebabToCamelCase(
                    omitNotletters(
                            omitLowerCaseGreekLetter(identifier)))
                    .replace(" ", "_")
                    .replace("-", "");
        }
        private static String convertKebabToCamelCase(String identifier){
            StringBuilder sb = new StringBuilder();
            int size = identifier.length();
            char repetead = '0';
            for (int i = 0; i < size; i++) {
                if (identifier.charAt(i) != '-' && identifier.charAt(i) != repetead){
                    sb.append(identifier.charAt(i));
                } else {
                    if (i + 1 < size && identifier.charAt(i) == '-'){
                        sb.append(Character.toUpperCase(identifier.charAt(i + 1)));
                        repetead = identifier.charAt(i + 1);
                    }
                }
            }
            return sb.toString().replace("-", "");
        }
        private static String omitNotletters(String identifier) {
            return identifier.chars()
                    .filter(c -> Character.isLetter(c)
                            || c == '-' || c == ' ')
                    .collect(StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append)
                    .toString();
        }

        private static String omitLowerCaseGreekLetter(String identifier){
            int alfa = 'α';
            int omega = 'ω';
            return identifier.chars()
                    .filter(c -> c < alfa || c > omega)
                    .collect(StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append)
                    .toString();
        }

    }
}
/*
Another way to iterate could be with a for each loop on identifier.toCharArray().

Instead of replacing characters in another String, which is computationally expensive,
perhaps append qualifying characters to a StringBuilder.

The first condition could check if it's a letter and is not a Greek letter.
The second could check if the char is a space. The third and fourth could check if it's
a control char or a hyphen. That would proceed from the most to the least likely condition.

Although I personally don't think it lends itself well to the functional approach for
either readability or performance, another approach might be more functional, such as
using Arrays.stream on split with map and collect.
 */
