public class p5 {
    // doubt
    public static void main(String[] args) {
        float costFence = 1600, rate = 25;// pertage
        float len = 20;
        float bth, area = costFence / rate, peri;
        System.out.println("length of rectangle : " + len);
        System.out.println("cost of fencing of rectangle : " + costFence);
        System.out.println("rate of fencing of rectangle : " + rate);
        System.out.println("area of rectangle : " + area);

        bth = area / len;
        System.out.println("breath of rectangle : " + bth);

        peri = 2 * (len + bth);
        System.out.println("perimeter of rectangle : " + peri);

    }
}
