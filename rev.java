public class rev {
    static long reverse(long n){
        long r=0;
        while (n>0) {
            long last=n%10;
            r=r*10+last;
            n=n/10;
        }
        return r;
    }
    static long eCount(long n){
        long even=0;
        while (n>0) {
            long last=n%10;
            if((last&1)==0)
                even++;
            n=n/10;
        }
        return even;
    }
    static long oCount(long n){
        long odd=0;
        while (n>0) {
            long last=n%10;
            if((last&1)!=0)
                odd++;
            n=n/10;
        }
        return odd;
    }
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
        while (n>0) {
            long last=n%10;
            if((last&1)==0)
                comb=comb*10+last;
            n=n/10;
        }
        return comb;
    }
    static long oComb(long n){
        long comb=0;
        while (n>0) {
            long last=n%10;
            if((last&1)!=0)
                comb=comb*10+last;
            n=n/10;
        }
        return comb;
    }
    static long eComb1(long n){
        long comb=0;
        while(n>0){
            long first=n/zfill(n/10);
            if((first&1)==0)
                comb=comb*10+first;
            n=n%zfill(n/10);
        }
        return comb;
    }
    static long oComb1(long n){
        long comb=0;
        while(n>0){
            long first=n/zfill(n/10);
            if((first&1)!=0)
                comb=comb*10+first;
            n=n%zfill(n/10);
        }
        return comb;
    }
    static long oeComb(long n){
        return eComb(n)*zfill(oComb(n))+oComb(n);
    }
    static long eoComb(long n){
        return oComb(n)*zfill(eComb(n))+eComb(n);
    }
    static long oeComb1(long n){
        return eComb1(n)*zfill(oComb1(n))+oComb1(n);
    }
    static long eoComb1(long n){
        return oComb1(n)*zfill(eComb1(n))+eComb1(n);
    }
    static long sumDigits(long n){
        long sum=0;
        while(n>0){
            long last=n%10;
            sum+=last;
            n=n/10;
        }
        return sum;
    }
    static int len(long n){
        int count=0;
        while(n>0){
            n=n/10;
            count=count+1;
        }
        return count;
    }
    static long summation(long n){
        long sum=0;
        while (n>0) {
            sum+=n;
            n--;
        }
        return sum;
    }
    static long summationDigits(long n){
        long sum=0;
        while(n>0){
            long last=n%10;
            sum=sum+summation(last);
            n=n/10;
        }
        return sum;
    }
    static long productDigits(long n){
        long pro=1;
        while(n>0){
            long last=n%10;
            pro*=last;
            n=n/10;
        }
        return pro;
    }
    public static void main(String[] args) {
        long n=612543L;
        System.out.println(reverse(n));
        System.out.println(eCount(n));
        System.out.println(oCount(n));
        System.out.println(eComb(n));
        System.out.println(oComb(n));
        System.out.println(oeComb(n));
        System.out.println(eoComb(n));
        System.out.println(oeComb1(n));
        System.out.println(eoComb1(n));
        System.out.println(sumDigits(n));
        // System.out.println(summation(n));
        System.out.println(summationDigits(n));
        System.out.println(productDigits(n));
    }
}