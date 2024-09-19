public class p37 {
    public static void main(String[] args) {

        double diameter, height = 6;
        double area = 149;
        // area = 2 * 3.14 * r * h ; curved surface area only

        diameter = area / (2 * 3.14 * height);
        System.out.println("Total diameter of cylindrical solid is : " + diameter);

    }
}
