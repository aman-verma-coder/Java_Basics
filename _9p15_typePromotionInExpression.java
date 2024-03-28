public class _9p15_typePromotionInExpression {
    public static void main(String[] args) {
        // // // char a = 'a';
        // // // char b = 'b';
        // // // char c = a + b;
        // // // System.out.println((int) (a));
        // // // System.out.println((int) (b));
        // // // System.out.println(a);
        // // // System.out.println(b);
        // // // System.out.println(a + b);
        // // // System.out.println(a - b);
        // // short a = 10;
        // // byte b = 11;
        // // char c = 'c';
        // // byte bt = (byte) (a + b + c);
        // // // System.out.println(c);
        // // System.out.println(bt);
        // int a = 10;
        // float b = 11f;
        // long c = 15;
        // double d = 20.55;
        // int ans = a + b + c + d;
        // System.out.println(ans);
        byte a = 10;
        byte b = (byte) (a * 2);
        System.out.println(a + "\n" + b);
    }
}