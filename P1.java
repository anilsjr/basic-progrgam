
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        int len = 0, bth = 0, peri = 2 * (len + bth), area;
        Scanner s = new Scanner(System.in);
        System.out.println("Perimeter of rectangle :");
        peri = s.nextInt();
        System.out.println("length of rectangle :");
        len = s.nextInt();
        bth = (peri - 2 * len) / 2;
        System.out.println("breath of rectangle :" + bth);
        area = len * bth;
        System.out.println("Area of rectangle :" + area);

    }

}