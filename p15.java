// 15. Shelly has a rectangular garden of length 22 m and breath 15 m. 
// Her friend Rachel has a square garden of side 21 m. 
// Whose garden is bigger and by how much?

public class p15 {
    public static int area(int x) {
        return x * x;
    }

    public static int area(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int areaSq = area(21), areaRect = area(22, 15);
        if (areaRect > areaSq) {
            System.out.println("Area of rectangle is more ");
        } else {
            System.out.println("Area of Square is more ");
        }
    }
}
