import java.util.Scanner;

public class _9p16_practiceQs1 {
    public static void main(String[] args) {
        int a, b, c;
        float sum, avg;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum = a + b + c;
        avg = sum / 3;
        System.out.println("The average of 3 numbers " + a + ", " + b + " and " + c + " is " + avg);
        sc.close();
    }
}