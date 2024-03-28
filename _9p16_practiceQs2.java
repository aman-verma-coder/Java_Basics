import java.util.Scanner;

public class _9p16_practiceQs2 {
    public static void main(String[] args) {
        int side, area;
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        area = side * side;
        System.out.println("The area of square having side " + side + " is " + area);
        sc.close();
    }
}
