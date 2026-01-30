import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] a1={1,4,5,9,14,6,1};
		System.out.println(BitonicIndex(a1));
	}
	private static int BitonicIndex(int[] arr){
	    int left=0;
	    int right=arr.length-1;
	    while(left<=right){
	        int mid=(left+right)/2;
	        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
	            return arr[mid];
	        }
	        else if(arr[mid-1]>arr[mid]){
	            right=mid-1;
	        }
	        else {
	            left=mid+1;
	        }
	    }
	    return -1;
	}
}
