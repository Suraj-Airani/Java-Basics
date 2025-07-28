public class an {
    static long zfill(long n){
        long z=1;
        while (n>0) {
            z=z*10;
            n=n/10;
        }
        return z;
    }
    static long eComb(long n){
        long comb=0;
        while(n>0){
            long first=n/zfill(n/10);
            if((first&1)==0)
                comb=comb*10+first;
            n=n%zfill(n/10);
        }
        return comb;
    }
    static long oComb(long n){
        long comb=0;
        while(n>0){
            long first=n/zfill(n/10);
            if((first&1)!=0)
                comb=comb*10+first;
            n=n%zfill(n/10);
        }
        return comb;
    }
    public static void main(String[] args) {
        long n=123456;
        System.out.println(eComb(n));
        System.out.println(oComb(n));
    }
}