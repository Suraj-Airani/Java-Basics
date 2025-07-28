public class conversions {
    static long dec2bin(long n){
        long val=0,a=1;
        while(n!=0){
            long rem=n%2;
            val=val+(rem*a);
            a=a*10;
            n=n/2;  
        }
        return val;
    }
    static long bin2dec(long n){
        long val=0,a=1;
        while(n!=0){
            long rem=n%10;
            val=val+(rem*a);
            a=a*2;
            n=n/10;  
        }
        return val;
    }
    static long dec2oct(long n){
        long val=0,a=1;
        while(n!=0){
            long rem=n%8;
            val=val+(rem*a);
            a=a*10;
            n=n/8;
        }
        return val;
    }
    static long oct2dec(long n){
        long val=0,a=1;
        while(n!=0){
            long rem=n%10;
            val=val+(rem*a);
            a=a*8;
            n=n/10;
        }
        return val;
    }
    static long bin2oct(long n){
        long val=0,a=1;
        while(n!=0){
            long rem=n%1000;
            val=val+(a*bin2dec(rem));
            a=a*10;
            n=n/1000;
        }
        return val;
    }
    static long oct2bin(long n){
        long val=0,a=1;
        while(n!=0){
            long rem=n%10;
            val=val+(a*dec2bin(rem));
            a=a*1000;
            n=n/10;
        }
        return val;
    }
    
    public static void main(String[] args) {
        long dec=15;
        long bin=111L;
        long oct=123;
        System.out.println(dec2bin(dec));
        System.out.println(bin2dec(bin));
        System.out.println(dec2oct(dec));
        System.out.println(oct2dec(oct));
        System.out.println(bin2oct(bin));
        System.out.println(oct2bin(oct));    
    }
}
