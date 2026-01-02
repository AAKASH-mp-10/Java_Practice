import java.util.*;

class input{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int[] a=new int[s.length];
        
        int j=0;
        for(String i:s){
            a[j]=Integer.parseInt(i);
            j++;
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
        
    }
}