public class circularprime {
    static long zfill(long n){
        long z=1;
        while (n>0) {
            z=z*10;
            n=n/10;
        }
        return z;
    }
    static long len(long n){
        long l=0;
        while(n>0){
            l++;
            n=n/10;
        }
        return l;
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
    static long rotate1(long n){
        return (n%10)*zfill(n/10)+(n/10);
    }
    static long isCircular(long n){
        long f=0;
        for(long i=0;i<len(n);i++){
            if(isPrime(n)==1){
                f++;
            }
            n=rotate1(n);
        }
        return (f==(len(n)))?1:0;
    }
    public static void main(String[] args) {
        
        System.out.println(rotate1(119));
        if(isCircular(193)==1)
            System.out.println("circular prime");
        else
            System.out.println("not a circular prime");
    }
}
