import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        int len = 0, bth = 0, area;
        int rate = 6;
        int cost;
        Scanner s = new Scanner(System.in);

        System.out.println("length of rectangle :");
        len = s.nextInt();
        System.out.println("breath of rectangle :");
        bth = s.nextInt();
        area = (len * bth);
        cost = area * rate / 100;
        System.out.println("Area of rectangle is:" + area);
        System.out.println("cost of tiling rectangle (rate = 6%)is:" + cost);

    }
}
