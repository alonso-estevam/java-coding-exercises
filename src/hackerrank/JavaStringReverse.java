package hackerrank;

import java.util.Scanner;

/* From: https://www.hackerrank.com/challenges/java-string-reverse/problem
    A palindrome is a word, phrase, number, or other sequence of characters which reads
    the same backward or forward. Given a string A, print Yes if it is a palindrome,
    print No otherwise.
    Constraints:  A will consist at most 50 lower case english letters.
    Sample Input:    madam
    Sample Output:   Yes

*/
public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        System.out.println(isPalindrome(word) ? "Yes" : "No");

        sc.close();

    }
    private static boolean isPalindrome (String word){
        StringBuilder reversed = new StringBuilder();
        for (int i = (word.length() - 1); i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return word.equalsIgnoreCase(reversed.toString());
    }
}
