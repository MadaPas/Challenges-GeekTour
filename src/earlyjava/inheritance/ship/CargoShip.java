package earlyjava.inheritance.ship;

class CargoShip extends Ship {
    private int capacity;

    public CargoShip(String n, int c) {
        setName(n);
        capacity = c;
    }

    public String toString() {
        String str = "Name: " + getName() + "\nWeight capacity: " + capacity;
        return str;
    }
}
