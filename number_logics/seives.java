public class seives {
    static long sq(long n){
        long t=n;
        while(t*t>n){
            t=(t+n/t)/2;
        }
        return t;
    }
    static boolean isprime(long n){
        if(n<2)
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(long i=5;(i*i)<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    static long zeros(long n){
        long z=1;
        while(n>0){
            z=z*10;
            n=n-1;
        }
        return z;
    }
    static void nthPrimeForward(long digit,long pos){
        long j=0;
        for(long i=(zeros(digit-1)+1);true;i+=2){
            if(isprime(i)){
                j++;
                if(j==pos){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    static void nthPrimeBackward(long digit,long pos){
        long j=0;
        for(long i=(zeros(digit)-1);true;i-=2){
            if(isprime(i)){
                j++;
                if(j==pos){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    static void factors(long n,long c){
        long j=0;
        for(long i=(n/2);i>=1;i--){
            if((n%i)==0){
                j++;
                System.out.print(i+" ");
                if(j==c){
                    break;
                }
            }
        }
    }
    static void checkPrime(long n){
        if(isprime(n))
            System.out.println(n);
        else
            factors(n, 2);
    }
    public static void main(String[] args) {
        // nthPrimeBackward(6, 11);
        // nthPrimeForward(3, 5);
        // System.out.println(999965/5);
        // factors(50,3);
        checkPrime(999955l);
    }
}
