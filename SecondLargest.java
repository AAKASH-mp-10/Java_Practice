import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] a1={1,5,6,3,2};
		int[] a2={2,2,1,2};
		int[] a3={};
		System.out.println(SecondLargest(a1));
		System.out.println(SecondLargest(a2));
        System.out.println(SecondLargest(a3));

	}
	private static int SecondLargest(int[] arr){
	    if(arr.length==0 || arr.length==1){
	        return -1;
	    }
	    int max=Integer.MIN_VALUE;
	    int smax=Integer.MIN_VALUE;
	    
	    for(int num : arr){
	        if(max<num ){
	            smax=max;
	            max=num;
	        }
	        else if(smax<num && max!=num){
	            smax=num;
	        }
	    }
	    if(smax==Integer.MIN_VALUE){
	        smax=max;
	    } 
	    return smax;
	}
}
