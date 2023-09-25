package exercism;

import static java.util.stream.IntStream.of;

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

        public BirdWatcher(int[] birdsPerDay) {
            this.birdsPerDay = birdsPerDay.clone();
        }

        public int[] getLastWeek() {
            return this.birdsPerDay;
        }

        public int getToday() {
            return this.birdsPerDay[6];
        }

        public void incrementTodaysCount() {
            this.birdsPerDay[6] += 1;
        }

        public boolean hasDayWithoutBirds() {
            return  of(this.birdsPerDay).anyMatch(b -> b == 0);
        }

        public int getCountForFirstDays(int numberOfDays) {
            return of(this.birdsPerDay).limit(numberOfDays).sum();
        }

        public int getBusyDays() {
            return (int) of(this.birdsPerDay)
                    .filter(b -> b >= 5)
                    .count();
        }
    }
}
