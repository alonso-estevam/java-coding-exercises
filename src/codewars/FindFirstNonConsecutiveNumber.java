package codewars;

public class FindFirstNonConsecutiveNumber {
    public static void main(String[] args) {
        Integer consecutive = FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8}); // must return 6
        System.out.println(consecutive);
    }

    static class FirstNonConsecutive {

        static Integer find(final int[] array) {
            for (int i = 0; i < array.length; i++) {
                if ((i + 1) < array.length) {
                    if (array[i+1] != (array[i] + 1)) {
                        return array[i + 1];
                    }
                }
            }
            return null;
        }


    }
}
