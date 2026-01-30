import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] a1={4,8,7,1,10,2,14};
		int n=6;
		System.out.println(NthSmallestNum(a1,n));
	}
	private static int NthSmallestNum(int[] arr,int n){
	    if(n>arr.length-1){
	        return -1;
	    }
	    PriorityQueue<Integer> heap=new PriorityQueue<>();
	    for(int num:arr){
	        heap.add(num);
	    }
	    for(int i=0;i<n-1;i++){
	        heap.poll();
	    }
	    return heap.peek();
	}
}
