package codewars;

import java.util.Arrays;


/*          WHAT IS IN BETWEEN? - 8kyu
Complete the function that takes two integers (a, b, where a < b) and return an array
of all integers between the input parameters, including them.
For example:
    a = 1
    b = 4
    --> [1, 2, 3, 4]
*/
public class WhatIsInBetween {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(1,4)));

    }
    private static int[] mySolution(int a, int b) {
        int size = (b - a) + 1;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = a;
            a++;
        }
        return numbers;
    }

}
