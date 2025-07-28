public class prime {
    static void primeFact(long n){
        for(long i=2;i<=(n/2);i++){
            if(n%i == 0){
                if(isPrime(i)==1){
                    System.out.print(i+" ");
                }
            }
        }
    }
    static long isPrime(long n){
        long f=0;
        for(long i=2;(i*i)<=n;i++){
            if(n%i==0){
                f=1;
                break;
            }
        }
        if(f==0)
            return 1;
        else
            return 0;
    }
    static void primeRange(long a, long b){
        for(long i=a;i<b+1;i++){
            if(isPrime(i)==1)
                System.out.print(i+" ");
        }
    }
    static void primeN(long n){
        long j=0;
        for(long i=0;(i+1)!=0;i++){
            if(isPrime(i)==1){
                j++;
                if(j==n){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        long n=12;
        long m=200;
        if(isPrime(n)==1)
            System.out.println("prime");
        else
            System.out.println("not prime");
        primeRange(n, m);
        System.out.println("\n");
        primeN(n);
        primeFact(51);
    }
}
