package earlyjava.methodclass2.parkingticketsimulator;

class ParkedCar {
    private String make, model, color, licenseNum, name, badge;
    private int mins;

    public ParkedCar(String ma, String mo, String co, String l, int mi) {
        make = ma;
        model = mo;
        color = co;
        licenseNum = l;
        mins = mi;
    }

    public ParkedCar(ParkedCar object2) {
        make = object2.make;
        model = object2.model;
        color = object2.color;
        licenseNum = object2.licenseNum;
        mins = object2.mins;
    }

    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }


    public String getLicenseNum() {
        return licenseNum;
    }


    public int getMinutes() {
        return mins;
    }


    public String toString() {
        String str;
        str = "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nLicense Plate: " + licenseNum + "\nMinutes parked: " + mins;
        return str;
    }
}