import java.util.Scanner;
public class table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number: ");
        int n=sc.nextInt();
        System.out.println("Enter the limit number: ");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int b=i*n;
            System.out.println(+n+"X"+i+"="+b);
        }
    }
}