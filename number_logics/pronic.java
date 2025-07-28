public class pronic {
    static long isPronic(long n){
        for(long i=1;i<(n/2)+1;i++){
            if((i*(i+1))==n)
                return 1;
        }
        return 0;
    }
    static void pronicRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isPronic(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void pronicN(long n){
        long j=0;
        for(long i=1;(i+1)!=0;i++){
            if(isPronic(i)==1){
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
        long m=1000;
        if(isPronic(n)==1)
            System.out.println("pronic number");
        else
            System.out.println("not a pronic number");
        pronicRange(n, m);
        System.out.println("\n");
        pronicN(25);
    }
}
