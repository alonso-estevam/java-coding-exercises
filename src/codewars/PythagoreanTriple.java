package codewars;

/*  From: https://www.codewars.com/kata/5951d30ce99cf2467e000013/train/java
Given an unsorted array of 3 positive integers [ n1, n2, n3 ], determine if it is possible
to form a Pythagorean Triple using those 3 integers.
A Pythagorean Triple consists of arranging 3 integers, such that:
    a² + b² = c²
Examples
[5, 3, 4] : it is possible to form a Pythagorean Triple using these 3 integers: 3² + 4² = 5²

[3, 4, 5] : it is possible to form a Pythagorean Triple using these 3 integers: 3² + 4² = 5²

[13, 12, 5] : it is possible to form a Pythagorean Triple using these 3 integers: 5² + 12² = 13²

[100, 3, 999] : it is NOT possible to form a Pythagorean Triple using these 3 integers -
no matter how you arrange them, you will never find a way to satisfy the equation a² + b² = c²
*/
public class PythagoreanTriple {
    public static void main(String[] args) {
        int[] p1={3,4,5};
        //int result = pythagoreanTriple(p1);
        int result = alternativeSolution(p1);

        System.out.println(result);
    }
    public static int pythagoreanTriple(int[] triple){
        if((triple[0] * triple[0]) + (triple[1] * triple[1]) == triple[2] * triple[2]){
            return 1;
        } else if((triple[0] * triple[0]) + (triple[2] * triple[2]) == triple[1] * triple[1]){
            return 1;
        } else if( (triple[1] * triple[1]) + (triple[2] * triple[2]) == triple[0] * triple[0] ) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int alternativeSolution(int[] triple){
        int a = triple[0] * triple[0];
        int b = triple[1] * triple[1];
        int c = triple[2] * triple[2];

        return ((a + b == c) || (a + c == b) || (b + c == a)) ? 1 : 0;
    }
}
