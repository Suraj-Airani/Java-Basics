public class spy {
    static long sumDigits(long n){
        long s=0;
        while(n>0){
            s+=(n%10);
            n/=10;
        }
        return s;
    }
    static long proDigits(long n){
        long p=1;
        while(n>0){
            p*=(n%10);
            n/=10;
        }
        return p;
    }
    static long isSpy(long n){
        return (sumDigits(n)==proDigits(n))?1:0;
    }
    static void spyRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isSpy(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void spyN(long n){
        long j=0;
        for(long i=1;(i+1)!=0;i++){
            if(isSpy(i)==1){
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
        long m=10000;
        if(isSpy(145)==1)
            System.out.println("spy number");
        else
            System.out.println("not a spy number");
        spyRange(n, m);
        System.out.println("\n");
        spyN(25);
    }
}
