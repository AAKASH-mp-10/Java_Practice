import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] a1={4,2,3,6,7,9};
		for(int num: a1){
		    System.out.print(num+" ");
		}
		TwoPointer(a1);
		System.out.println();
		for(int num: a1){
		    System.out.print(num+" ");
		}
	}
	private static void TwoPointer(int[] arr){
	    int i=0;int j=arr.length-1;
	    while(i<=j){
	        if(arr[i]%2==0){
	            if(arr[j]%2!=0){
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	                i++;
	                j--;
	            }else{
	                j--;
	            }
	        }else{
	            i++;
	        }
	    }
	}
}
