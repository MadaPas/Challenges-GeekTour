package earlyjava.inheritance.prefferedcustomer;

public class PreferredCustomerClass {

    public static void main(String[] args) {
        Customer c = new Customer();
        PreferredCustomer p = new PreferredCustomer(1254.96);

        c.setCustomerNumber(1561);
        c.setName("John Smith");
        c.setAddress("316 South St.");
        c.setPhone("(555)631-1228");
        c.setMailing(true);

        System.out.println(c);
        System.out.println(p);
    }

}
