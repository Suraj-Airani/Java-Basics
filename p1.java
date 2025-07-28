import java.util.*;
public class p1 {
    static int power(int n,int k){
        int pow=1;
        for(int i=0;i<k;i++){
            pow=pow*n;
        }
        return pow;
    }
    static int len(int n){
        int l=0;
        while(n>0){
            l++;
            n=n/10;
        }
        return l;
    }
    static int sumPow(int n){
        int val=0;
        int t=n;
        while (n>0) {
            val=val+power((n%10), len(t));
            n=n/10;
        }
        return val;
    }
    static int lzfill(int n){
        int z=1;
        while (n>0) {
            z=z*10;
            n=n-1;
        }
        return z;
    }
    static int digitNpow(int n){
        int sum=0;
        for(int i=lzfill(n-1);i<lzfill(n);i++){
            if(i==sumPow(i)){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(digitNpow(n));
        System.out.println(lzfill(n-1));
        System.out.println(lzfill(n));
    }
}                                                                                                         