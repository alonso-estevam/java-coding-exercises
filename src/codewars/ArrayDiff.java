package codewars;

/* From: https://www.codewars.com/kata/523f5d21c841566fde000009/java
    Your goal in this kata is to implement a difference function, which subtracts one list
    from another and returns the result.

    It should remove all values from list a, which are present in list b keeping their order.

    Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
    If a value is present in b, all of its occurrences must be removed from the other:

    Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3} */
import java.util.*;

public class ArrayDiff {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 2, 2, 3};
        int[] b = new int[] {2};

        int[] res = arrayDiff(a, b);

    }
    public static int[] arrayDiff(int[] a, int[] b){
        List<Integer> arrayA = arrayToList(a);
        List<Integer> arrayB = arrayToList(b);
        arrayA.removeAll(arrayB);
        return listToArray(arrayA);
    }

    private static List<Integer> arrayToList(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }
    private static int[] listToArray(List<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
