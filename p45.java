public class p45 {

    public static void main(String[] args) {

        int a = -21, sum = 0;
        System.out.println("AP: \n-21 -18 -15 -12 .....");
        for (int i = 1; i <= 28; i++) {
            sum += a;
            a += 3;

        }
        System.out.println("sum of 28 terms is : " + sum);

    }
}