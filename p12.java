import java.lang.Math;

public class p12 {
    public static void main(String[] args) {

        int hypo = 13, base, height = 12;
        base = (int) Math.sqrt(hypo * hypo - height * height);
        double area = 1/2.0 * base * height;
        System.out.println(area);
    }
}
