package codewars;

import java.util.stream.IntStream;

/*  From: https://www.codewars.com/kata/58cb43f4256836ed95000f97/train/java
    In this simple exercise, you will create a program that will take two lists of integers,
    a and b. Each list will consist of 3 positive integers above 0, representing the dimensions
    of cuboids a and b. You must find the difference of the cuboids' volumes regardless of which
    is bigger.

    For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and
    the volume of b is 20. Therefore, the function should return 8.
*/
public class DifferenceOfVolumesOfCuboids {
    public static void main(String[] args) {
        int result = findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2});
        System.out.println(result);

    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int volume1 = IntStream.of(firstCuboid).reduce(1, (n1, n2) -> n1 * n2);
        int volume2 = IntStream.of(secondCuboid).reduce(1, (n1, n2) -> n1 * n2);

        return Math.abs(volume1 - volume2);
    }

    private static int solutionWithoutStream(final int[] firstCuboid, final int[] secondCuboid){
        return Math.abs((firstCuboid[0] * firstCuboid[1] * firstCuboid[2]) -
                secondCuboid[0] * secondCuboid[1] * secondCuboid[2]);
    }
}
