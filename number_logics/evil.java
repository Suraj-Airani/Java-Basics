public class evil {
    static long dec2bin(long n){
        long val=0,a=1;
        while(n!=0){
            long rem=n%2;
            val=val+(rem*a);
            a=a*10;
            n=n/2;  
        }
        return val;
    }
    static long count1s(long n){
        long c=0,b=dec2bin(n);
        while (b>0) {
            if((b%10)==1){
                c++;
            }
            b/=10;    
        }
        return c;
    }
    static long isEvil(long n){
        if((count1s(n)&1)==0)
            return 1;
        else
            return 0;
    }
    static void evilRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isEvil(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void evilN(long n){
        long j=0;
        for(long i=0;(i+1)!=0;i++){
            if(isEvil(i)==1){
                j++;
                if(j==n){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        long n=1;
        long m=100;
        if(isEvil(m)==1)
            System.out.println("evil");
        else
            System.out.println("not evil");
        evilRange(n, m);
        System.out.println("\n");
        evilN(10);
    }
}
