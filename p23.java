public class p23 {
    public static void main(String[] args) {
        // cube in cm
        double len = 3;
        // box in cm
        double lenB = 15, bthB = 9, HeightB = 12;
        double units;
        double volCube = len * len * len, volBox = lenB * bthB * HeightB;
        units = volBox / volCube;
        System.out.println("No. of units that can be fit inside box are :" + units);

    }
}
