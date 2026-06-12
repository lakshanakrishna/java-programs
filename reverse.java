import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int d = sc.nextInt();
        int r = 0;
        while (d != 0) {
            int a = d % 10;
            r = r * 10 + a;
            d = d / 10;
        }
        System.out.println(+r);
    }
}