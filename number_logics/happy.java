public class happy {
    static long sumDigitSqr(long n){
        long sum=0;
        while(n>0){
            long l=n%10;
            sum+=(l*l);
            n/=10;
        }
        return sum;
    }
    static long isHappy(long n){
        while (true) {
            if((sumDigitSqr(n)/10) ==0){
                n=sumDigitSqr(n);
                break;
            }
            else
                n=sumDigitSqr(n);
        }
        return (n==1)?1:0;
    }
    static void happyRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isHappy(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void happyN(long n){
        long j=0;
        for(long i=1;(i+1)!=0;i++){
            if(isHappy(i)==1){
                j++;
                if(j==n){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    static void firstN(long n){
        for(long i=0;i<n;i++){
            if(isHappy(i)==1)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        long n=1;
        long m=100;
        if(isHappy(n)==1)
            System.out.println("happy number");
        else
            System.out.println("not a happy number");
        happyRange(n, m);
        System.out.println("\n");
        happyN(25);
    }
}
