package hackerrank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        System.out.println(solution(word));

        sc.close();

    }
    private static String solution (String word){
        StringBuilder reversed = new StringBuilder();
        for (int i = (word.length() - 1); i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return word.contentEquals(reversed) ? "Yes" : "No";
    }
}
