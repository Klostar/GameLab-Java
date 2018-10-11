public class Game {

    private Player player1;
    private Player player2;
    private Deck deck;
    private Dealer dealer;

    public Game(Player player1, Player player2, Deck deck, Dealer dealer) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
        this.dealer = dealer;
    }

    public void startGame() {
        dealer.dealDeck(deck, player1, player2);
        Card player1Card = player1.playCard();
        Card player2Card = player2.playCard();
    }


    public Player judgeHand(Card player1Card, Card player2Card) {
        if(player1Card.getValueFromEnum() > player2Card.getValueFromEnum()){
            return player1;
        }
     return player2;
    }
}
