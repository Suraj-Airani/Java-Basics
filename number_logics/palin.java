public class palin {
    static long rev(long n){
        long r=0;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }
        return r;
    }
    static void palindrome(long n){
        if(n==rev(n))
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
    static void palinRange(long a, long b){
        for(long i=a; i<b+1;i++){
            if(i==rev(i))
                System.out.print(i+" ");
        }
    }
    static void palinN(long n){
        long j=0;
        for(long i=0;(i+1)!=0;i++){
            if(i==rev(i)){
                j++;
                if(j==n){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        long n=100;
        long m=1000;
        palindrome(n);
        palinRange(n, m);
        palinN(n);
    }
}
