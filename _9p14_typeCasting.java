import java.util.Scanner;

public class _9p14_typeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float a = 10.95555f;
        // int b = (int) a;
        // System.out.println(a + "\n" + b);
        char ch1 = 'a';
        int a = (int) ch1;
        char ch2 = 'b';
        int b = (int) ch2;
        System.out.println(a + "\n" + b);
        sc.close();
    }
}