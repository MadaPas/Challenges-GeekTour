package earlyjava.methodclass1.coinsimulator;

import java.util.Random;

class Coins {
    private String sideUp;

    public Coins() {
        Random rand = new Random();
        int x = rand.nextInt(2);
        if (x == 0) {
            sideUp = "Heads";
        } else {
            sideUp = "Tails";
        }
    }

    public void toss() {
        Random rand = new Random();
        int x = rand.nextInt(2);
        if (x == 0) {
            sideUp = "Heads";
        } else {
            sideUp = "Tails";
        }
    }

    public String getSideUp() {
        return sideUp;
    }

}
