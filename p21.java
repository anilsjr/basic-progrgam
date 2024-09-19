public class p21 {
    public static void main(String[] args) {
        // brick in cm
        int lenB = 15, bthB = 8, HeightB = 5;
        // Wall in m
        int lenW = 15, bthW = 10, HeightW = 8;
        long noBrick;
        int volBrick = lenB * bthB * HeightB, volWall = lenW * bthW * HeightW;
        noBrick = 1000000 * volWall / volBrick;
        System.out.println("No. of brick required are :" + noBrick);

    }
}
