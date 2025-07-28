public class a1 {
    static long max(long a[]){
        long val=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>val)
                val=a[i];
        }
        return val;
    }
    static void disp(long a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
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
    static long min(long a[]){
        long val=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<val)
                val=a[i];
        }
        return val;
    }
    static void sqrStore(long a[]){
        for(int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
    }
    static void binStore(long a[]){
        for(int i=0;i<a.length;i++){
            a[i]=dec2bin(a[i]);
        }
    }
    static long count1s(long n){
        long c=0;
        while(n>0){
            long l=n%10;
            if(l==1)
                c++;
            n/=10;
        }
        return c;
    }
    static void count01(long a[]){
        for(int i=0;i<a.length;i++){
            a[i]=count1s(a[i]);
        }
    }
    public static void main(String[] args) {
        long a[]={65,90,97,122,32,48,57};
        long prod=1;
        for(int i=0;i<a.length;i++){
            prod*=a[i];
        }    
        System.out.println("product : "+prod);
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println();
        disp(a);
        System.out.println();
        binStore(a);
        System.out.println();
        disp(a);
        System.out.println();
        count01(a);
        System.out.println();
        disp(a);
        System.out.println();

    }
}
