import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        int l_rec, b_rec, l_tile, b_tile, Num_tile;

        Scanner s = new Scanner(System.in);
        System.out.print("length of rectangle region :");
        l_rec = s.nextInt();
        System.out.print("breath of rectangle region");
        b_rec = s.nextInt();
        int area_rec = l_rec * b_rec;

        System.out.print("length of tile :");
        l_tile = s.nextInt();
        System.out.print("breath of tile : ");
        b_tile = s.nextInt();
        int area_tile = l_tile * b_tile;

        Num_tile = area_rec / area_tile;

        System.out.println("Number of tiles needed are : " + Num_tile);

    }
}
