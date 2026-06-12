import java.lang.*;
import java.util.Scanner;
public class stringg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        name="Java";
        System.out.println(name);
        System.out.println("Enter string");
        String input=sc.nextLine();
        System.out.println("entered string:"+input);
        String a=name.concat(" ").concat(input);
        System.out.println(a);
        System.out.println(name);
        String first,second;
        first = new String("Good");
         second = new String(" Morning");
        String b=first.concat(second);
        System.out.println(b);
        String c="1 2";
        String d="1 2";
        String r=c.concat(d);
        System.out.println(r);
        String a = new String("3");
        String b = new String("3");
        System.out.println(a==b);*/
        String s ="Java Programming";
        int e=s.length();
        System.out.println(e);
        for(char i:s.toCharArray()){
            System.out.println(i);
        }
    }
}