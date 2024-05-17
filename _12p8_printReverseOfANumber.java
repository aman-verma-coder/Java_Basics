public class _12p8_printReverseOfANumber {
    public static void main(String[] args) {
        int n = 123456789;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
}
