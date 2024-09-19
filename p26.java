public class p26 {
    public static void main(String[] args) {
        // brick in cm
        double lenB = 24, bthB = 15;
        // Wall in m
        double lenP = 120, bthP = 2.4;
        double noBrick;
        double areaBrick = lenB * bthB, areaPath = lenP * bthP;
        noBrick = 10000 * areaPath / areaBrick;
        System.out.println("No. of brick required are :" + noBrick);

    }
}
