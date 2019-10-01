package earlyjava.methodclass2.geometry;

class Geometry {
    private static double height;
    private static double radius;
    private static double length;
    private static double width;

    public static double circArea(double r) {
        radius = r;
        return Math.PI * Math.pow(radius, 2);
    }

    public static double rectArea(double l, double w) {
        length = l;
        width = w;
        return length * width;
    }

    public static double triArea(double b, double h) {
        height = h;
        return b * height * .5;
    }
}