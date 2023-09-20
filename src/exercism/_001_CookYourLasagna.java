package exercism;

// From: https://exercism.org/tracks/java/exercises/lasagna
public class _001_CookYourLasagna {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        int expectedMinutesInOven = lasagna.expectedMinutesInOven();
        int remainingMinutesInOven = lasagna.remainingMinutesInOven(30);
        int preparationTimeInMinutes = lasagna.preparationTimeInMinutes(2);
        int totalTimeInMinutes = lasagna.totalTimeInMinutes(3, 20);

        System.out.println(expectedMinutesInOven);
        System.out.println(remainingMinutesInOven);
        System.out.println(preparationTimeInMinutes);
        System.out.println(totalTimeInMinutes);
    }

    static class Lasagna {

        private static final int MINUTES_IN_OVEN = 40;
        private static final int LASAGNA_LAYER_PREP_MINUTES = 2;

        public int expectedMinutesInOven(){
            return MINUTES_IN_OVEN;
        }
        public int remainingMinutesInOven(int minutesPassed){
            return MINUTES_IN_OVEN - minutesPassed;
        }
        public int preparationTimeInMinutes(int numberOfLayers){
            return numberOfLayers * LASAGNA_LAYER_PREP_MINUTES;
        }
        public int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
            return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
        }
    }
}
