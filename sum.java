import java.io.*;
import java.util.Scanner;
public class sum{
    public static void main(String args[]){
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit:");
        n=sc.nextInt();
        while(n>0){
        int a=n%10;
        sum+=a;
        n=n/10;
        }
        System.out.println(sum);
    }
}