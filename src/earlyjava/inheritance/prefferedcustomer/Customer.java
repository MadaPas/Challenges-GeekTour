package earlyjava.inheritance.prefferedcustomer;

class Customer extends Person {
    private int customerNumber;
    private boolean mailing;

    public Customer() {
    }


    public void setCustomerNumber(int n) {
        customerNumber = n;
    }

    public void setMailing(boolean m) {
        mailing = m;
    }

    public String getMailing() {
        String str;
        if (mailing)
            str = "yes";
        else
            str = "no";
        return str;
    }

    public String toString() {
        String str;
        str = "Name: " + getName()
                + "\nAddress: " + getAddress()
                + "\nPhone: " + getPhone()
                + "\nCustomer Number: " + customerNumber
                + "\nMailing list: " + getMailing();
        return str;
    }
}
