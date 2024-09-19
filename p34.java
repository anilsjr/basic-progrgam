public class p34 {
    public static void main(String[] args) {
        int b1 = 128, b2 = 92, h = 40;
        int lenWay = 4, bthWay = 40;
        double area = 0.5 * (b1 + b2) * h;
        double areaWay = lenWay * bthWay;
        System.out.println("Area of wooded trapezoid before walkway: " + area);
        System.out.println("Area of walkway: " + areaWay);
        area -= areaWay;
        System.out.println("Area of wooded trapezoid after construction walkway: " + area);

    }
}
