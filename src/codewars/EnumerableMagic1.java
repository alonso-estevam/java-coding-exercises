package codewars;

import java.util.function.IntPredicate;

/*
Create a method all which takes two params:
    a sequence
    a function (function pointer in C)
and returns true if the function in the params returns true for every element in the sequence.
Otherwise, it should return false. If the sequence is empty, it should return true, since
technically nothing failed the test.
    Example:    all((1, 2, 3, 4, 5), greater_than_9) -> false
                all((1, 2, 3, 4, 5), less_than_9)    -> True
*/
public class EnumerableMagic1 {
    public static void main(String[] args) {

        boolean output = all(new int[] {10, 2, 6, 4}, i -> i % 2 == 0);

        System.out.println(output);

    }
    public static boolean all(int[] list, IntPredicate predicate){
        for (int i = 0; i < list.length; i++) {
            if(! predicate.test(list[i])){
                return false;
            }
        }
        return true;
    }
}
