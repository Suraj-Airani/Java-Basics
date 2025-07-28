public class numop {
    static long reverse(long n){
        long r=0;
        while (n>0) {
            long last=n%10;
            r=r*10+last;
            n=n/10;
        }
        return r;
    }
    static long sumsqr(long n){
        long sumsqr=0;
        while (n>0) {
            long last = n%10;
            sumsqr+=(last*last);
            n=n/10;
        }
        return sumsqr;
    }
    static long power(long n,long k){
        long pow=1;
        for(int i=0;i<k;i++){
            pow=pow*n;
        }
        return pow;
    }
    static long len(long n){
        long l=0;
        while(n>0){
            l++;
            n=n/10;
        }
        return l;
    }
    static long sumpow(long n){
        long val=0;
        long t=n;
        while (n>0) {
            val=val+power((n%10), len(t));
            n=n/10;
        }
        return val;
    }
    static long zfill(long n){
        long z=1;
        while (n>0) {
            z=z*10;
            n=n/10;
        }
        return z;
    }
    static long first(long n){
        return n/zfill(n/10);
    }
    static long sumPowNext(long n){
        long val=0;
        long t=n;
        for(long i=0;i<len(t)-1;i++){
            long powVal=power(first(n), first(n%zfill(n/10)));
            val=val+powVal;
            n=n%zfill(n/10);            
        }
        val=val+t%10;
        return val;
    }
    static long decode(long n){
        long val=0;
        n=reverse(n);
        while(n!=0){
            long last=n%10;
            val=val*10+(last%2);
            n=n/10;
        }
        return val;
    }
    
    public static void main(String[] args) {
        long n=123456L;
        System.out.println(sumsqr(n));
        System.out.println(power(n, 0));
        System.out.println(len(n));
        System.out.println(sumpow(n));
        System.out.println(sumPowNext(n));
        System.out.println(decode(n));
    }
}