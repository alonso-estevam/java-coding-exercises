package hackerrank;

import java.util.Scanner;

/* From: https://www.hackerrank.com/challenges/java-end-of-file/problem
 The challenge here is to read n lines of input until you reach EOF, then number and print all  lines of content.
    Hint: Java's Scanner.hasNext() method is helpful for this problem.
Input Format: Read some unknown n lines of input from stdin(System.in) until you reach EOF;
 each line of input contains a non-empty String.
Output Format: For each line, print the line number, followed by a single space, and then the line
content received as input.
Sample Input:
    Hello world
    I am a file
    Read me until end-of-file.
Sample Output:
    1 Hello world
    2 I am a file
    3 Read me until end-of-file.        */
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        StringBuilder sb = new StringBuilder();

        while(sc.hasNext() ){
            sb.append(i).append(" ").append(sc.nextLine()).append(System.lineSeparator());
            i++;

            if(sc.nextLine().isEmpty()){
                break;
            }
        }

        System.out.println(sb);

        sc.close();
    }
}
