import java.util.Scanner;

public class _11p9_switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("You have ordered Samosa");
                break;
            case 2:
                System.out.println("You have ordered Biryani");
                break;
            case 3:
                System.out.println("You have ordered Milkshake");
                break;
            case 4:
                System.out.println("You have ordered Burger");
                break;
            case 5:
                System.out.println("You have ordered Butter Chicken");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        sc.close();
    }
}