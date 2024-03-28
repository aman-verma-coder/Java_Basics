import java.util.Scanner;

public class _9p16_practiceQs3 {
    public static void main(String[] args) {
        float pencil, pen, eraser, sum, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil: ");
        pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen: ");
        pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser: ");
        eraser = sc.nextFloat();
        sum = pencil + pen + eraser;
        total = (sum) + (0.18f * sum);
        System.out.println("The total cost of the items before applying GST is " + sum);
        System.out.println("The total cost of the items after applying GST is " + total);
        sc.close();
    }
}
