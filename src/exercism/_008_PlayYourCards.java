package exercism;

// From: https://exercism.org/tracks/java/exercises/blackjack
public class _008_PlayYourCards {
    public static void main(String[] args) {
        boolean res = isBlackjack("ace", "ace");
        System.out.println(res);
    }

    public static int parseCard(String card){
        return switch (card.toLowerCase()) {
            case "ace" -> 11;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            case "ten", "jack", "queen", "king" -> 10;
            default -> 0;
        };
    }
    // Blackjack = two cards that sum up to a value of 21
    public static boolean isBlackjack(String card1, String card2){
        if(card1.equals("ace") && card2.equals("ace")){
            return false;
        } else {
            int sum = parseCard(card1) + parseCard(card2);
            return sum >= 21;
        }
    }

    /*  Decisions:
        - Stand (S)
        - Hit (H)
        - Split (P)
        - Automatically win (W) */
    public String largeHand(boolean isBlackjack, int dealerScore) {
        //If isBlackJack is true, the dealerScore needs to be checked for being lower than 10. If it is lower, return "W" otherwise "S".
        if (isBlackjack) {
            if (dealerScore < 10) {
                return "W";
            } else {
                return "S";
            }
        } else {
            return "P";
        }
    }

//    If your cards sum up to 17 or higher you should always stand.
//    If your cards sum up to 11 or lower you should always hit.
//    If your cards sum up to a value within the range [12, 16]
//    you should always stand if the dealer has a 6 or lower.
//    If your cards sum up to a value within the range [12, 16] you should
//    always hit if the dealer has a 7 or higher.
    public static String smallHand(int handScore, int dealerScore) {
        if(handScore >= 17){
            return "S";
        } else if (handScore <= 11){
            return "H";
        } else {
            if(dealerScore <= 6){
                return "S";
            } else {
                return "H";
            }
        }
    }

}
