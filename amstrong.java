import java.io.*;
import java.util.Scanner;
public class amstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        int num=n;
        int sum=0;
        int digits=String.valueOf(n).length();
        while(n>0){
            int remainder=n%10;
            sum+=Math.pow(remainder,digits);
            n=n/10;      
        }
        if(sum==num){
            System.out.println(+num+" This number is an amstrong number");
        }
        else{
            System.out.println(+num+"  This number is  not an amstrong number");
        }
    }
}