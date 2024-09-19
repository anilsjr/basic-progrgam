import java.util.Scanner;

public class p2 {
    public static int area(int len, int bth) {
        return (len * bth);
    }

    public static int perimeter(int len, int bth) {
        return 2 * (len + bth);
    }
    
    public static void main(String[] args) {
        int l = 10, b = 12;
        int area;
        Scanner s = new Scanner(System.in);
        // System.out.println("area of rectangle :");
        // area = s.nextInt();
        area = area(l, b);
        System.out.println("AREA is : " + area);
        // System.out.println("length of rectangle :");
        // l = s.nextInt();
        b = area / l;
        System.out.println("breth of rectangle is : " + b);
    }
}
