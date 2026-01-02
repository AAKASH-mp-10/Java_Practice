
import java.util.*;
public class Main
{
    public static String prime(int n){
	        if(n<=1){
	            return("Invalid");
	        }
	        else{
	            for(int i=2;i<=Math.sqrt(n);i++){
	                if(n%i==0){
	                    return("Not prime");
	                    
	                }
	            }
	        }
	        return("Is Prime");
	    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=sc.nextInt();
	    System.out.println(prime(n));
	    
	}
}