import java.util.*;

//Using Bitwise oprator
public class Main
{
	public static void main(String[] args) {
		int[] a1={4,2,5,4,2};
		System.out.println(UniqueElement(a1));
	}
	
	private static int UniqueElement(int[] arr){
	    int result=0;
	    for(int num: arr){
	        result^=num;
	    }
	    return result;
	}
}



// if the numbers are same then Bit will will be one



