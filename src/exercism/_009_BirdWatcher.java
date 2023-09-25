package exercism;

import java.util.Arrays;

// From: https://exercism.org/tracks/java/exercises/bird-watcher/edit
public class _009_BirdWatcher {
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 2, 1 };
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        int a[] = birdWatcher.getLastWeek();
        int b = birdWatcher.getToday();
        int c = birdWatcher.getCountForFirstDays(4);
        int d = birdWatcher.getBusyDays();

        System.out.print("{ ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("}");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    public static class BirdWatcher {
        private final int[] birdsPerDay;
        private final int lastIndex;
        public BirdWatcher(int[] birdsPerDay) {
            this.birdsPerDay = birdsPerDay.clone();
            this.lastIndex = birdsPerDay.length - 1;
        }
        public int[] getLastWeek() {
            return birdsPerDay;
        }
        public int getToday() {
            return (lastIndex > -1)? birdsPerDay[lastIndex]: 0;
        }
        public void incrementTodaysCount() {
            birdsPerDay[lastIndex] = getToday() + 1;
        }
        public boolean hasDayWithoutBirds() {
            return Arrays.stream(birdsPerDay).anyMatch(day -> day == 0);
        }
        public int getCountForFirstDays(int numberOfDays) {
            return Arrays.stream(birdsPerDay, 0,
                    Math.min(birdsPerDay.length, numberOfDays))
                    .sum();
        }
        public int getBusyDays() {
            return Arrays.stream(birdsPerDay)
                    .reduce(0, (count, day) -> count += (day > 4)? 1 : 0);
        }
    }
}
