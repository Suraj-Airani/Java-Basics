public class bit {
    static void count01(long n){
        long set=0,reset=0;
        while(n>0){
            if((n&1)==1){
                set++;
                n=n>>1;
            }
            else{
                reset++;
                n=n>>1;
            }
        }
        System.out.println("set : "+set);
        System.out.println("reset : "+reset);
    }
    static void setOrNot(long n,long i){
        if((n&(1<<i))!=0)
            System.out.println("set");
        else
            System.out.println("reset");
    }
    static void ithBitSet(long n, long i){
        System.out.println(n|(1<<i));
    }
    static void ithBitReset(long n, long i){
        System.out.println(~(~n|(1<<i)));
    }
    static void flip(long n, long i){
        System.out.println(n^(1<<i));
    }
    static void powerOf2(long n){
        if((n&(n-1))==0)
            System.out.println("power of 2");
        else
            System.out.println("not a power of 2");
    }
    public static void main(String[] args) {
        long n=68;
        count01(n);
        setOrNot(n, 2);
        ithBitSet(n, 2);
        ithBitReset(n, 2);
        flip(n, 3);
        powerOf2(n);
    }
}
