public class magic {
    static long sumDigits(long n){
        long sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    static long isMagic(long n){
        while (true) {
            if((sumDigits(n)/10) ==0){
                n=sumDigits(n);
                break;
            }
            else
                n=sumDigits(n);
        }
        return (n==1)?1:0;
    }
    static void magicRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isMagic(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void magicN(long n){
        long j=0;
        for(long i=1;(i+1)!=0;i++){
            if(isMagic(i)==1){
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
        long m=100;
        if(isMagic(n)==1)
            System.out.println("magic number");
        else
            System.out.println("not a magic number");
        magicRange(n, m);
        System.out.println("\n");
        magicN(17);
    }
}
