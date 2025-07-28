public class numass {
    static long len(long n){
        long count=0;
        while (n>0) {
            count++;
            n=n/10;
        }
        return count;
    }
    static long one(long n){
        long f=1;
        if(n<1){
            f=-1;
        }
        return f*n%10;
    }
    static long two(long n){
        long f=1;
        if(n<1){
            f=-1;
        }
        return f*n/10;
    }
    static long three(long n,long m){
        return n*zfill(m)+m;
    }
    static long seven(long n,long m){
        return m*zfill(n)+n;
    }
    static long zfill(long n){
        long z=1;
        while (n>0) {
            z=z*10;
            n=n/10;
        }
        return z;
    }
    static long lzfill(long n){
        long z=1;
        while(n>0){
            z=z*10;
            n=n-1;
        }
        return z;
    }
    static long eight(long n,long m){
        long r=zfill(n)/zfill(m);
        return m*r + n%r;
    }
    static long nine(long n, long m){
        long r=lzfill(len(n)/2);
        long temp=n;
        n=n/r;
        n=n*zfill(m)+m;
        n=n*r;
        n=n+(temp%r);
        return n;
    }
    static long ten(long n,long m){
        long r1=lzfill(len(n)/2);
        long r2;
        if(len(m)%2>0){
            r2=lzfill((len(m)/2)+1);
        }
        else{
            r2=lzfill(len(m)/2);
        }
        long temp=n;
        // if(r1==r2)
        //     n=n/(r1*(r2/10));
        // else
            n=n/(r1*r2);
        n=n*(zfill(m))+m;
        n=n*(r1/(lzfill(len(m)/2)));
        n=n+(temp%(r1/(lzfill(len(m)/2))));
        return n;
    }
    public static void main(String[] args) {
        long n=1234567;
        long m=777;
        // System.out.println(one(n));
        // System.out.println(two(n));
        // System.out.println(three(n, m));
        // System.out.println(seven(n, m));
        // System.out.println(eight(n, m));
        System.out.println(nine(n,m));
        // System.out.println(ten(n,m));
    }
}