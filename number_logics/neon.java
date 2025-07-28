public class neon {
    static long sumDigits(long n){
        long sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    static long isNeon(long n){
        return (sumDigits(n*n)==n)?1:0;
    }
    static void neonRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isNeon(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void neonN(long n){
        long j=0;
        for(long i=0;(i+1)!=0;i++){
            if(isNeon(i)==1){
                j++;
                if(j==n){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        long n=0;
        long m=10000;
        if(isNeon(m)==1)
            System.out.println("neon");
        else
            System.out.println("not a neon");
        neonRange(n, m);
        System.out.println("\n");
        neonN(3);
    }
}
