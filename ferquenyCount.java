import java.util.*;

class ferquenyCount {
    public static ArrayList<ArrayList<Integer>> count(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(e.getKey());
            temp.add(e.getValue());
            res.add(temp);
        }
        return res;
    }
    
    
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("enter the array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        //System.out.println(Arrays.toString(a));
        ArrayList<ArrayList<Integer>> b=count(a);
        for (ArrayList<Integer> x : b) {
            System.out.println(x.get(0) + " " + x.get(1));
        }
    }
        
}