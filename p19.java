public class p19 {
    static int volume(int a) {
        return a * a * a;
    }

    static int volume(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        int side = 7, len = 7, bth = 4, height = 8;
        int cubeVol = volume(side);
        int cuboidVol = volume(len, bth, height);
        if (cubeVol > cuboidVol) {
            System.out.println("cubeVol is bigger");
        } else
            System.out.println("cuboidVol is bigger");

    }
}
