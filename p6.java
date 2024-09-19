import java.lang.Math;

public class p6 {
    public static void main(String[] args) {
        int s1 = 12, s2 = 13, s3, s;
        double area;
        int peri = 30;
        s3 = peri - s1 - s2;
        s = peri / 3;
        int x = (s - s1) * (s - s2) * (s - s3);
        if (x < 0) {
            x = -1 * x;
        }
        area = Math.sqrt(x);
        System.out.print(x);
    }
}
