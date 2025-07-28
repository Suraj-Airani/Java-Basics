public class larsma {
    static long large(long n){
        long val=0;
        while(n>0){
            long l=n%10;
            if(l>val)
                val=l;
            n/=10;
        }
        return val;
    }
    static long small(long n){
        long val=9;
        while(n>0){
            long l=n%10;
            if(l<val)
                val=l;
            n/=10;
        }
        return val;
    }
    static long secLarge(long n){
        long large=large(n);
        long val=0;
        while(n>0){
            if(((n%10)>val) && ((n%10)<large))
                val=n%10;
            n/=10;
        }
        return val;
    }
    static long secSmall(long n){
        long small=small(n);
        long val=9;
        while(n>0){
            if(((n%10)<val) && ((n%10)>small))
                val=n%10;
            n/=10;
        }
        return val;
    }
    public static void main(String[] args) {
        long n=2519810L;
        System.out.println(large(n));
        System.out.println(small(n));
        System.out.println(secLarge(n));
        System.out.println(secSmall(n));
    }
}
