package hackerrank;

import java.util.*;

/* We use the integers a, b, and n to create the following series:
(a + 2 to power of 0 * b), (a + 2 to power of 0 * b + 2 to power of 1 * b), ... (a + ... + 2 to power of n-1 * b)
You are given q queries in the form of a, b, and n. For each query, print the
series corresponding to the given a, b, and n values as a single line of  space-separated integers.
 From: https://www.hackerrank.com/challenges/java-loops/problem  */
public class JavaLoopsII {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("number of queries: ");
        int q = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < q; i++){
            System.out.print("a, b and n: ");
            String input = sc.nextLine();
            String[] parameters = input.split(" ");

            map.put(i, (mySolution(parameters)));
        }

        for (Integer i : map.keySet()) {
            System.out.print(map.get(i));
        }

        sc.close();

    }
    private static List<Integer> mySolution(String[] parameters){
        List<Integer> arr = new ArrayList<>();
        int a = Integer.parseInt(parameters[0]);
        int b = Integer.parseInt(parameters[1]);
        int n = Integer.parseInt(parameters[2]);

        int index = 0;
        int sum = a;

        for(int i = n; i >= 1; i--){
            int multiplication = (int) (Math.pow(2, (n-i)) * b);
            sum += multiplication;
            arr.add(sum);
            index++;
        }
        return arr;
    }
}
