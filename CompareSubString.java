import java.util.*;

//for sorted Array
public class Main
{
	public static void main(String[] args) {
		int[] a1={1,2,3,4};
		int[] a2={2,4,5};
		System.out.println(CompareSubString(a1,a2));
	}
	
	private static boolean CompareSubString(int[] a1,int[] a2){
	    int i=0,j=0;
	    while(i<a1.length && j<a2.length){
	        if(a1[i]==a2[j]){
	            i++;
	            j++;
	        }
	        else if (a1[i]<a2[j]){
	            i++;
	        }
	        else{
	            return false;
	        }
	    }
	    return j==a2.length;
	}
}




/**for unsorted arrays
 * 
 HashSet<Integer> arr =new HashSet<Integer>();
 for(int num1:arr1){
    arr.set(num1);
}
for(int num2 : arr2){
    if(!arr.contains(num2)){
        return false;
    }
}
return true;
**/