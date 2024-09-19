public class p24 {
    public static void main(String[] args) {
        // brick in cm
        double lenB = 25, bthB = 10, HeightB = 7.5;
        // Wall in m
        double lenW = 20, bthW = 2, HeightW = 0.75;
        double noBrick;
        double volBrick = lenB * bthB * HeightB, volWall = lenW * bthW * HeightW;
        noBrick = 1000000 * volWall / volBrick;
        double cost = 0.9 * noBrick;
        System.out.println("No. of brick required are :" + noBrick);
        System.out.println("Cost (in $) is :" + cost);

    }
}
