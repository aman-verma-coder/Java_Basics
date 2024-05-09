import java.util.Scanner;

public class _11p10_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = sc.nextInt();
        System.out.println("Enter the operator('+','-','*','/','%'): ");
        char op = sc.next().charAt(0);
        System.out.println("Enter the second number: ");
        float b = sc.nextInt();
        float sum = a + b;
        float diff = a - b;
        float mul = a * b;
        float div = a / b;
        float mod = a % b;
        switch (op) {
            case '+':
                System.out.println("The sum of " + a + " and " + b + " is: " + sum);
                break;
            case '-':
                System.out.println("The difference of " + a + " and " + b + " is: " + diff);
                break;
            case '*':
                System.out.println("The product of " + a + " and " + b + " is: " + mul);
                break;
            case '/':
                System.out.println("The division of " + a + " and " + b + " is: " + div);
                break;
            case '%':
                System.out.println("The modulo of " + a + " and " + b + " is: " + mod);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        sc.close();
    }
}
