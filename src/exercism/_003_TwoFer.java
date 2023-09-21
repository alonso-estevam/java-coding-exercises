package exercism;

import java.util.Optional;

// From: https://exercism.org/tracks/java/exercises/two-fer
public class _003_TwoFer {
    public static void main(String[] args) {
        String givenName = "Aline";
        String nullName = null;
        String emptyName = "";

        System.out.println(Twofer.twofer(givenName));
        System.out.println(Twofer.twofer(nullName));
        System.out.println(Twofer.twofer(emptyName));

    }

    public class Twofer {
        public static String twofer(String name) {
            return String.format("One for %s, one for me.",
                    Optional.ofNullable(name).orElse("you"));
        }
    }
}
