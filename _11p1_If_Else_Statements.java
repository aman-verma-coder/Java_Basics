public class _11p1_If_Else_Statements {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else if (age < 18 && age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not adult");
        }
    }
}