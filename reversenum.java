import java.util.*;
public class reversenum {
    public static int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int ld = x % 10;
            rev = rev * 10 + ld;
            x = x / 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println("Reversed number: " + result);
    }
}