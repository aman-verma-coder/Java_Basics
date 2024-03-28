import java.util.Scanner;

public class _9p12_areaOfCircle {
    public static void main(String[] args) {
        double radius, pi, area;
        pi = 3.14;
        System.out.println("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        area = pi * radius * radius;
        System.out.println("The area of circle with radius " + radius + " unit/units is " + area + "sq. units");
        sc.close();
    }
}
