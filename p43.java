import java.lang.Math;

public class p43 {
    public static void main(String[] args) {
        double radi, pheight = 4, sheight = 5, cost;
        radi = Math.sqrt(sheight * sheight - pheight * pheight);
        double area = 3.14 * radi * (radi + sheight);
        cost = area * 10;
        System.out.println("Total area of cone to be painted is : " + area);
        System.out.println(" COST to paint Total area of cone  is : " + cost);

    }
}
