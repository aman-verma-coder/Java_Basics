import java.util.Scanner;

public class _11p8_Check_if_a_student_will_pass_or_fail {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        marks = sc.nextInt();
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("The student will " + result);
        sc.close();
    }
}
