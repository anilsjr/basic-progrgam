public class p32 {
    public static void main(String[] args) {
        // sq pool in m
        double lenP = 25, lenG = 150;
        double areaPool = lenP * lenP;
        double areaGarden = lenG * lenG;
        areaGarden -= areaPool;

        System.out.println("area of pool is  : " + areaPool);
        System.out.println("area of Garden is  : " + areaGarden);

    }
}
