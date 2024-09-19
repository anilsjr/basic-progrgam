public class p39 {
    public static void main(String[] args) {

        float radi = 10, height;
        float area, volume = 1287;
        height = volume / (radi * radi * 2);
        area = 2 * 3.14f * radi * ( radi + height) ;
        System.out.println("Total surface Area of cylindrical solid is : " + area);

    }
}
