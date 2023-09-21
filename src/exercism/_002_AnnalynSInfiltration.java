package exercism;

// From: https://exercism.org/tracks/java/exercises/annalyns-infiltration
/* possible actions:
*  - if the knight is sleeping --> fast attack
*  - if the knight OR the arch OR the prisoner is awake --> spy
*  - if the prisoner is awake AND the archer is sleeping --> signal prisoner
*  - if [the dog is present AND the archer is asleep]
*       OR [dog isn't present AND the prisoner is awake
*           AND the knight and archer are both sleeping] --> free prisoner */
public class _002_AnnalynSInfiltration {
    public static void main(String[] args) {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;

        System.out.println("Can fast attack? " + AnnalynsInfiltration.canFastAttack(knightIsAwake));
        System.out.println("Can spy? " + AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println("Can signal prisoner? " + AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println("Can free prisoner? " + AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, true));
    }

}

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return  (petDogIsPresent && !archerIsAwake)
                || ((!petDogIsPresent && prisonerIsAwake) && !knightIsAwake && !archerIsAwake);
    }
}
