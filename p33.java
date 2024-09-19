public class p33 {
    public static void main(String[] args) {
        // sq pool in m
        double lenG = 30, bthG = 20;

        double lenP1 = 30, lenP2 = 20;
        double bthP1 = 3, bthP2 = 4;

        double areaPath = lenP1 * bthP1 + lenP2 * bthP2 - bthP1 * bthP2;
        double areaGarden = lenG * bthG;
        areaGarden -= areaPath;

        System.out.println("area of path is  : " + areaPath);
        System.out.println("useful area of Garden is  : " + areaGarden);

    }
}

