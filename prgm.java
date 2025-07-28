public class prgm
{
    static long one(long n){
        int f=1;
        if(n<0)
            f=-1;
        return f*n%10;
    }
   
    static long two(long n){
        int f=1;
        if(n<0)
            f=-1;
        return f*n/10;
    }
    static long zfill(long n){
        long z=1;
        while(n>0){        
            z=z*10;
            n=n/10;
        }
        return z;
    }
    static long lzfill(long n){
        long z=1;
        for(int i=0;i<n;i++){
            z=z*10;
        }
        return z;
    }
   
    static long three(long n,long m){
        long r=n*zfill(m);
        r=r+m;
        return r; //n*zfill(m)+m;
    }
   
    static long four(long n,long m){
        long r=n/zfill(m);
        r=r*zfill(m);
        r=r+m;
        return r; //n*zfill(m)+m;
    }
   
    static long five(long n){
        long z=zfill(n/10);
        long f=n/z;
        return  f;   //n/zfill(n/10); 123
    }
    static long six(long n){
        return  n%zfill(n/10); //123
    }
   
    static long seven(long n,long m){
        return m*zfill(n)+n;
    }
    static long eight(long n,long m){
        long r=zfill(n)/zfill(m);
       
        return m*r+n%r;
    }
    static int len(long n){
        int count=0;
        while(n>0){
            n=n/10;
            count=count+1;
        }
        return count;
    }
    static long nine(long n,long m){
        int l=len(n);
        long t=n;
        long r=lzfill(l/2);
        n=n/r;
        n=n*zfill(m)+m;
        n=n*r;
        n=n+(t%r);
        return n;
    }
   
    static long ten(long n,long m){
        long r1=lzfill(len(n)/2); //100
        long r2;
        if(len(m)%2>0)  
            r2=lzfill((len(m)/2)+1);//100
        else
            r2=lzfill(len(m)/2);
        long t=n;
        if(r1==r2)
            n=n/(r1*(r2/10));//10000
        else
            n=n/(r1*r2);
        n=n*(zfill(m))+m;
        n=n*(r1/(lzfill(len(m)/2)));
        n=n+t%(r1/(lzfill(len(m)/2)));
        return n;
    }
   
   
    public static void main(String[] args) {
        long n=1234567;
        long m=777L;
        System.out.println(one(n));
        System.out.println(two(n));
        System.out.println(zfill(m));        
        System.out.println(three(n,m));
        System.out.println(four(n,m));
        System.out.println(five(n));
        System.out.println(six(n));
        System.out.println(seven(n,m));
        System.out.println(eight(n,m));
        System.out.println(nine(n,m));
        System.out.println(ten(n,m));
    }
}