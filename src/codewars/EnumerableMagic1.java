package codewars;

import java.util.function.IntPredicate;

/*
Create a method all which takes two params:
    a sequence
    a function (function pointer in C)
and returns true if the function in the params returns true for every element in the sequence.
Otherwise, it should return false. If the sequence is empty, it should return true, since
technically nothing failed the test.
*/
public class EnumerableMagic1 {
    public static void main(String[] args) {

    }
    public static boolean all(int[] list, IntPredicate predicate){
        // REMINDER: a Predicate "p" is tested for argument "arg" using p.test(arg)
        return true;
    }
}
