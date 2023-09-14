package codewars;

public class SleighAuthentication {
    public static void main(String[] args) {
        String name = "Someone";
        String password = "super secret";

        Boolean allowedInSleigh = Sleigh.authenticate(name, password);

        System.out.println(allowedInSleigh);

    }
    private static class Sleigh {

        private final static String SANTA_USER = "Santa Claus";
        private final static String SANTA_PASSWORD = "Ho Ho Ho!";

        public static Boolean authenticate(String name, String password) {
            return SANTA_USER.equals(name) && SANTA_PASSWORD.equals(password);
        }
    }
}
