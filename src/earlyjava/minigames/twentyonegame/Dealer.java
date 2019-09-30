package earlyjava.minigames.twentyonegame;

class Dealer {
    Die die = new Die();

    public void roll() {
        die.roll();
    }

    public int getRoll() {
        return die.getRoll();
    }
}
