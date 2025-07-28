public class armstrong {
    static long len(long n){
        long l=0;
        while(n>0){
            l++;
            n=n/10;
        }
        return l;
    }
    static long power(long n,long k){
        long pow=1;
        for(int i=0;i<k;i++){
            pow=pow*n;
        }
        return pow;
    }
    static long sumLen(long n){
        long sum=0;
        long t=n;
        while (n>0) {
            long l=n%10;
            sum=sum+power(l, len(t));
            n/=10;
        }
        return sum;
    }
    static long isArmstrong(long n){
        return (n==sumLen(n))?1:0;
    }
    static void armRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isArmstrong(i)==1)
                System.out.print(i+" ");
        }
    }
    static void armN(long n){
        long j=0;
        for(long i=0;true;i++){
            if(isArmstrong(i)==1){
                j++;
                if(j==n+1){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        long n=1;
        long m=5000;
        if(isArmstrong(5)==1)
            System.out.println("armstrong number");
        else
            System.out.println("not a armstrong number");
        armRange(n, m);
        System.out.println("\n");
        armN(15);
    }
}
