package Cards;

public class CardPower {
    private CardSuite cardSuite;
    private CardRanks cardRank;
    private int power;



    public CardPower(CardSuite cardSuite, CardRanks cardRank) {
        this.cardSuite = cardSuite;
        this.cardRank = cardRank;
    }

    public int getPower() {
        power = cardRank.getRankPower() + cardSuite.getSuitPower();
        return power;
    }
}
