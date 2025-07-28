public class strong {
    static long fact(long n){
        long f=1;
        while(n>0){
            f*=n;
            n--;
        }
        return f;
    }
    static long factOfDigits(long n){
        long sum=0;
        while(n>0){
            sum+=(fact(n%10));
            n/=10;
        }
        return sum;
    }
    static long isStrong(long n){
        return (n==factOfDigits(n))?1:0;
    }
    static void strongRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isStrong(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void strongN(long n){
        long j=0;
        for(long i=1;true;i++){
            if(isStrong(i)==1){
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
        long m=50000;
        System.out.println(factOfDigits(25));
        if(isStrong(145)==1)
            System.out.println("strong number");
        else
            System.out.println("not a strong number");
        strongRange(n, m);
        System.out.println("\n");
        strongN(4);
    }
}
