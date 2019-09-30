package earlyjava.exceptions.payroll;

class emptyName extends Exception {
    public emptyName() {
        super("Name field cannot be empty");
    }
}
