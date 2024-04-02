public class _10p6_Assignment_Operators {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        System.out.println(y);
        x += 5;
        System.out.println(x); // 15
        x -= 5;
        System.out.println(x); // 10
        x *= 5;
        System.out.println(x); // 50
        x /= 5;
        System.out.println(x); // 10
        x %= 3;
        System.out.println(x); // 1
    }
}
