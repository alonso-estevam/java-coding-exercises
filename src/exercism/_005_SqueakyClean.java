package exercism;

// From: https://exercism.org/tracks/java/exercises/squeaky-clean
/*  In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is
    comprised of zero or more letters and underscores.
    In all cases the input string is guaranteed to be non-null.
    Note that the clean method should treat an empty string as valid.
 */
public class _005_SqueakyClean {
    public static void main(String[] args) {
        //String result = SqueakyClean.clean("myβ\0Id à-Ḃç ωa1\uD83D\uDE002\uD83D\uDE003\uD83D\uDE00b");

        String result = SqueakyClean.omitLowerCaseGreekLetter("MyΟβιεγτFinder");
        System.out.println(result);

    }
    static class SqueakyClean {
        static String clean(String identifier) {
//            for (int i = 0; i < identifier.length(); i++) {
//                if (!Character.isLetter(identifier.charAt(i)) &&
//                        (identifier.charAt(i) != '-' || identifier.charAt(i) != ' ')){
//                    identifier = identifier.replace(String.valueOf(identifier.charAt(i)), "");
//                }
//            }
            return identifier.replace("-", "");
        }

        private static String replaceSpacesWithUndescore(String identifier){
            return identifier.replace(" ", "_");
        }

        private static String replaceControlCharacters(String identifier) {
            for (int i = 0; i < identifier.length(); i++) {
                if (Character.isISOControl(identifier.charAt(i))) {
                    identifier = identifier
                            .replace(String.valueOf(identifier.charAt(i)), "CTRL");
                }
            }
            return identifier;
        }

        private static String omitLowerCaseGreekLetter(String identifier){
            int alfa = (int) 'α';
            int omega = (int) 'ω';

            for (int i = 0; i < identifier.length(); i++) {
                if (identifier.charAt(i) >= alfa && identifier.charAt(i) <= omega){
                    identifier = identifier.replace(String.valueOf(identifier.charAt(i)), "");
                }
            }
            return identifier;
        }


    }
}
