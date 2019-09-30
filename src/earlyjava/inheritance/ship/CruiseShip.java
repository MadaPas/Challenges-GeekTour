package earlyjava.inheritance.ship;

public class CruiseShip extends Ship {
    private int maxPass;

    public CruiseShip(String n, int m) {
        setName(n);
        maxPass = m;
    }

    public String toString() {
        String str = "Ship name: " + getName() + "\nMax. passengers: " + maxPass;
        return str;
    }
}
