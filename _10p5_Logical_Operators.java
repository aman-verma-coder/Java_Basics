public class _10p5_Logical_Operators {
    public static void main(String[] args) {
        System.out.println("Logical AND Operator");
        System.out.println((10 == 10) && (8 != 9));
        System.out.println((10 == 10) && (8 != 8));
        System.out.println((10 == 0) && (8 != 9));
        System.out.println((10 == 0) && (8 != 8));
        System.out.println("Logical OR Operator");
        System.out.println((5 == 5) || (5 != 6));
        System.out.println((5 == 6) || (5 != 6));
        System.out.println((5 == 5) || (5 != 5));
        System.out.println((5 == 6) || (5 != 5));
        System.out.println("Logical NOT Operator");
        System.out.println(!(2 == 2));
        System.out.println(!(2 == 5));
    }
}