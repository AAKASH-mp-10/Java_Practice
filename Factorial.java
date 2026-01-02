
import java.util.*;
public class Main
{
    public static long fact(int n){
        long a=1;
        if(n<1){
            return 1;
        }
        else{
            
            for(int i=1;i<=n;i++){
                a*=i;
            }
        }
        return a;
	        
}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=sc.nextInt();
	    System.out.println(fact(n));
	}
}