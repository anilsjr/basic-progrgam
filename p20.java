public class p20 {
    static int volume(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        int len = 25, bth = 10, height = 8;
        int cuboidVol = volume(len, bth, height);
        System.out.println("volume of cuboidal is :" + cuboidVol);
    }
}
