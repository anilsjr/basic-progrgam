public class p29 {
    public static void main(String[] args) {
        // sq tile in cm
        double lenT = 10;
        // floor in cm
        double lenF = 900, bthF = 800;
        double noTile;
        double areaFloor = lenF * bthF, areaTile = lenT * lenT;
        noTile = areaFloor / areaTile;
        System.out.println("No. of tiles required are : " + noTile);

    }
}
