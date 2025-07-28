import java.util.ArrayList;

public class p3 {
    public static ArrayList<Integer> solve(int[] a) {
        // Write your code here
            ArrayList<Integer> c=new ArrayList<>();
            int b[]=new int[a.length];
            for(int i=0;i<a.length;i++){
                b[a[i]-1]++;
            }
            for(int i=0;i<a.length;i++){
                if(b[i]==0)
                    c.add(i+1);    
            }
            return c;
        }

    public static void main(String[] args) {
        int a[]={4,3,2,7,8,2,3,1};
        System.out.println(solve(a));
    }
}

