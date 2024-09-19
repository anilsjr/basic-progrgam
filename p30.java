public class p30 {
    public static void main(String[] args) {
        // sq tile in cm
        double lenT = 5, bthT = 8;
        // floor in cm
        double lenF = 200, bthF = 400;
        double noTile;
        double areaFloor = lenF * bthF, areaTile = lenT * bthT;
        noTile = areaFloor / areaTile;
        System.out.println("No. of tiles required are : " + noTile);

    }
}
