public class automorphic {
    static long zfill(long n){
        long z=1;
        while (n>0) {
            z=z*10;
            n=n/10;
        }
        return z;
    }
    static long isAutomorphic(long n){
        return (((n*n)%zfill(n))==n)?1:0;
    }
    static void autoRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isAutomorphic(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void autoN(long n){
        long j=0;
        for(long i=1;(i+1)!=0;i++){
            if(isAutomorphic(i)==1){
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
        long m=1000000L;
        if(isAutomorphic(109376)==1)
            System.out.println("automorphic number");
        else
            System.out.println("not automorphic number");
        autoRange(n,m);
        System.out.println("\n");
        autoN(11);
    }
}
