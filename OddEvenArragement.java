import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] a1={4,2,3,6,7,9};
		System.out.println(Arrays.toString(a1));
		OddEven(a1);
		System.out.println(Arrays.toString(a1));
		
	}
	private static void OddEven(int[] arr){
	    int even=0;int odd=1;
	    int n= arr.length;
	    while(even<n && odd < n){
	        if(arr[even]%2==0){
	            even+=2;
	        }
	        else if(arr[odd]%2!=0){
	            odd+=2;
	        }
	        else {
	            int temp=arr[even];
	            arr[even]=arr[odd];
	            arr[odd]=temp;
	            even+=2;
	            odd+=2;
	        }
	    }
	}
}
