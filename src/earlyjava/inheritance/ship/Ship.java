package earlyjava.inheritance.ship;

public class Ship {
    private String name, year;

    public Ship() {
    }

    public Ship(String n, String y) {
        name = n;
        year = y;
    }

    public void setName(String n) {
        name = n;
    }


    public String getName() {
        return name;
    }


    public String toString() {
        String str = "Ship name: " + name + "\nYear built: " + year;
        return str;
    }
}
