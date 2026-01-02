
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=sc.nextInt();
	    int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
	}
}