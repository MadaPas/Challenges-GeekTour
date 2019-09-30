package earlyjava.exceptions.excption.project;

class InvalidPayRate extends Exception {

    public InvalidPayRate(double p) {
        super("Pay rate cannot be negative number (" + p + ")");
    }

}
