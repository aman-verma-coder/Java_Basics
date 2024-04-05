import java.util.Scanner;

public class _11p5_Income_Tax_Calculator {
    public static void main(String[] args) {
        int income, tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income: ");
        income = sc.nextInt();
        if (income < 250000) {
            tax = 0;
        } else if (income >= 250000 && income < 600000) {
            tax = (int) (income * 0.10);
        } else if (income >= 600000 && income < 1000000) {
            tax = (int) (income * 0.18);
        } else {
            tax = (int) (income * 0.30);
        }
        System.out.println("Tax: " + tax);
        sc.close();
    }
}
