public class sqr {
    
    static long isPerfectSqr(long n){
        for(long i=0;i<(n+1);i++){
            if(i*i==n)
                return 1;
        }
        return 0;
    }
    static void persqrRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isPerfectSqr(i)==1)
                System.out.print(i+" ");
        }
        System.out.println("\n");
    }
    static void persqrN(long n){
        long j=0;
        for(long i=0;(i+1)!=0;i++){
            if(isPerfectSqr(i)==1){
                j++;
                if(j==n){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    static long isSunny(long n){
        return (isPerfectSqr(n+1)==1)?1:0;
    }
    static void sunnyRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isSunny(i)==1)
                System.out.print(i+" ");
        }
    }
    static void sunnyN(long n){
        long j=0;
        for(long i=0;(i+1)!=0;i++){
            if(isSunny(i)==1){
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
        if(isPerfectSqr(n)==1)
            System.out.println("Yes");
        else
            System.out.println("No");
        persqrRange(n, m);
        persqrN(15);
        if(isSunny(n)==1)
            System.out.println("Sunny Number");
        else
            System.out.println("Not a sunny number");
        sunnyRange(n, m);
        System.out.println("\n");
        sunnyN(16);
    }
}
