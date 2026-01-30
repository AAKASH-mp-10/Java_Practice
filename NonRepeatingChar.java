import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s1="abcacb";
		System.out.println(NonRepeatingChar(s1));
	}
	private static char NonRepeatingChar(String str){
	    if(str.length()<=0){
	        return '0';
	    }
	    int[] count=new int[256];
	    for(int i=0;i<str.length();i++){
	        count[str.charAt(i)]++;
	    }
	    for(int i=0;i<str.length();i++){
	        if(count[str.charAt(i)]==1){
	            return str.charAt(i);
	        }
	    }
	   return '0';
	}
}
