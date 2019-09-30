package earlyjava.exceptions.retailitem;

class NegativeUnits extends Exception {
    public NegativeUnits(int d) {
        super("Error, units on hand is negative value (" + d + ")");
    }
}
