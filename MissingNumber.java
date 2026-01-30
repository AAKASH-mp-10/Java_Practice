import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] a1={0,1,2,4};
		System.out.println(MissingNumber(a1));
	}
	private static int MissingNumber(int[] arr){
	   if(arr.length==0){
	       return 0;
	   }
	   int length=arr.length;
	   int total=length*(length+1)/2;
	   for(int num: arr){
	       total-=num;
	   }
	   return total;
	}
}
