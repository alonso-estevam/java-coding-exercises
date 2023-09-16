package hackerrank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* From: https://www.hackerrank.com/challenges/java-datatypes/problem
  Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double.
  For this exercise, we'll work with the primitives used to hold integer values
  (byte, short, int, and long):
        A byte is an 8-bit signed integer.
        A short is a 16-bit signed integer.
        An int is a 32-bit signed integer.
        A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.
To get you started, a portion of the solution is provided for you in the editor.

Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

Input Format
The first line contains an integer, T, denoting the number of test cases.
Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily
large or small.

Output Format
For each input variable n and appropriate primitive dataType, you must determine if the given
primitives are capable of storing it. If yes, then print:
     n can be fitted in:
     dataType
 If there is more than one appropriate data type, print each one on its own line and order them
 by size (i.e.: byte < short < int < long).

If the number cannot be stored in one of the four aforementioned primitives, print the line:
    n can't be fitted anywhere.
*/
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        List<BigDecimal> inputs = new ArrayList<>();

        for (int i = 0; i < numberOfInputs; i++) {
            inputs.add(new BigDecimal(sc.next()));
        }

        inputs.forEach(input -> System.out.println(solution(input)));

        sc.close();

    }

    private static String solution(BigDecimal integer){
        if (fitByte(integer)){
            return integer + " can be fitted in:\n" +
                    "* byte\n" +
                    "* short\n" +
                    "* int\n" +
                    "* long";
        }
        if(fitShort(integer)){
            return integer + " can be fitted in:\n" +
                    "* short\n" +
                    "* int\n" +
                    "* long";
        }
        if (fitInt(integer)){
            return integer + " can be fitted in:\n" +
                    "* int\n" +
                    "* long";
        } if (fitLong(integer)){
            return integer + " can be fitted in:\n" +
                    "* long";
        }
        return integer + " can't be fitted anywhere.";
    }
    private static boolean fitLong(BigDecimal integer){
        return integer.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) <= 0
                && (integer.compareTo(BigDecimal.valueOf(Long.MIN_VALUE)) > 0);
    }
    private static boolean fitInt(BigDecimal integer){
        return integer.compareTo(BigDecimal.valueOf(Integer.MAX_VALUE)) <= 0
                && (integer.compareTo(BigDecimal.valueOf(Integer.MIN_VALUE)) > 0);
    }
    private static boolean fitShort(BigDecimal integer){
        return integer.compareTo(BigDecimal.valueOf(Short.MAX_VALUE)) <= 0
                && (integer.compareTo(BigDecimal.valueOf(Short.MIN_VALUE)) > 0);
    }
    private static boolean fitByte(BigDecimal integer){
        return (integer.compareTo(BigDecimal.valueOf(Byte.MAX_VALUE)) <= 0)
                && (integer.compareTo(BigDecimal.valueOf(Byte.MIN_VALUE)) > 0);
    }

}
