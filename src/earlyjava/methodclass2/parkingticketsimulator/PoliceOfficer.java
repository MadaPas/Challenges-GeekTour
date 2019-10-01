package earlyjava.methodclass2.parkingticketsimulator;

class PoliceOfficer {
    private String name, badge;

    public PoliceOfficer(String n, String b) {
        name = n;
        badge = b;
    }

    public String getName() {
        return name;
    }

    public String getBadge() {
        return badge;
    }
}
