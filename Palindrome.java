
import java.util.*;
public class Main
{
    public static String palin(int n){
        int temp=n;
        int rev=0,t=0;
        while(n>0){
            t=n%10;
            rev=rev*10+t;
            n=n/10;
        }
        if(rev==temp){
            return("Palindrome");
        }
        else{
            return("Not Palindrome");
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=sc.nextInt();
	    System.out.println(palin(n));
	}
}