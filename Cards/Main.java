package Cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Card Suits:");
//        for (CardSuite cardSuit: CardSuite.values()) {
//            System.out.printf("Ordinal value: %d; Name value: %s%n",cardSuit.ordinal(),cardSuit.name());
//        }

//        System.out.println("Card Ranks:");
//        for (CardRanks cardRank :
//                CardRanks.values()) {
//            System.out.printf("Ordinal value: %d; Name value: %s%n",cardRank.ordinal(),cardRank.name());
//        }

        Scanner sc = new Scanner(System.in);
        CardRanks cardRank = CardRanks.valueOf(sc.nextLine());
        CardSuite cardSuite = CardSuite.valueOf(sc.nextLine());
        CardPower cardPower = new CardPower(cardSuite,cardRank);

        System.out.printf("Card name: %s of %s; Card power: %d",cardRank.name(),cardSuite.name(),cardPower.getPower());


    }
}
