package earlyjava.methodclass2.carpetcalculator;

import java.text.DecimalFormat;

class RoomCarpet {
    private RoomDimension r;
    private double totalCost;

    public RoomCarpet(RoomDimension room, double c) {
        RoomDimension r = new RoomDimension(room);
        totalCost = c * r.getArea();
    }

    public String toString() {
        DecimalFormat d = new DecimalFormat("$#,###,###,##0.00");
        String str = "The total cost of the carpet is " + d.format(totalCost);
        return str;
    }
}
