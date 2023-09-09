package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Two strings,  and , are called anagrams if they contain all the same characters
in the same frequencies. For this challenge, the test is not case-sensitive.
For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA
 From: https://www.hackerrank.com/challenges/java-anagrams/problem     */
public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String output = mySolution(str1, str2);

        System.out.println(output);

        sc.close();

    }

    private static String mySolution(String str1, String str2){
        Map<Character, Integer> mapStr1 = new HashMap<>();
        Map<Character, Integer> mapStr2 = new HashMap<>();
        mapFrequencyLetters(mapStr1, str1.toLowerCase());
        mapFrequencyLetters(mapStr2, str2.toLowerCase());
        if(mapStr1.equals(mapStr2)){
            return "Anagrams";
        } else {
            return "Not Anagrams";
        }
    }

    private static Integer countFrequencyLetter(String str, char letter){
        Integer count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

    private static void mapFrequencyLetters(Map<Character, Integer> strMap, String str){
        for (int i = 0; i < str.length(); i++) {
            strMap.put(str.charAt(i), countFrequencyLetter(str, str.charAt(i)));
        }
    }
}
