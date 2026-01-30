import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s1=" abcba";
		String s2="abca";
		String s3="@ab$ba ";
		System.out.println(Palindrome(s1));
		System.out.println(Palindrome(s2));
        System.out.println(Palindrome(s3));

	}
	private static boolean Palindrome(String str){
	    if(str.length()==0 || str.length()==1){
	        return false;
	    }
	    int left=0;
	    int right=str.length()-1;
	    while(left<right){
	        if(!Character.isAlphabetic(str.charAt(left))){
	            left++;
	        }
	        else if(!Character.isAlphabetic(str.charAt(right))){
	            right--;
	        }
	        else if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
	            return false;
	        }
	        else{
	            left++;
	            right--;
	        }
	    }
	    return true;
	}
}
