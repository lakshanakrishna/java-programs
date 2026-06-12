import java.util.Scanner;
public class sstar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n-1; i++) {//shape
            for (int j = 1; j <= n - i; j++) {//space
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("* ");//star
            }
            System.out.println();
}
        for (int i = n; i >= 1; i--) {//shape
            for (int j = 1; j <= n - i; j++) {//space
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("* ");//star
            }
            System.out.println();
        }
        sc.close();
    }
    }