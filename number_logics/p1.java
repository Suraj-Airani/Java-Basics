public class p1 {
    static long sumOfN(long n){
        long sum=0;
        for(long i=1;i<n+1;i++){
            sum=sum+i;
        }
        return sum;
    }
    static long fact(long n){
        long f=1;
        while(n>0){
            f*=n;
            n-=1;
        }
        return f;
    }
    static long permutation(long n,long r){
        return fact(n)/fact(n-r);
    }
    static long rev(long n){
        long r=0;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }
        return r;
    }
    static long len(long n){
        long l=0;
        while(n>0){
            l++;
            n/=10;
        }
        return l;
    }
    static long gcd(long a,long b){
        while(b!=0){
            long t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        long n=1;
        long m=100;
        // System.out.println(sumOfN(n));
        // System.out.println(fact(n));
        // System.out.println(rev(m));
        // System.out.println(sumDigits(m));
        // System.out.println(len(m));
        // System.out.println(gcd(n, m));
        // System.out.println(permutation(n, m));
        System.out.println(lcm(n, m));
    }
}