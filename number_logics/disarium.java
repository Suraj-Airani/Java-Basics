public class disarium {
    static long power(long n,long k){
        long pow=1;
        for(int i=0;i<k;i++){
            pow=pow*n;
        }
        return pow;
    }
    static long len(long n){
        long l=0;
        while(n>0){
            l++;
            n=n/10;
        }
        return l;
    }
    static long sumPow(long n){
        long sum=0,j=0,t=n;
        while(n>0){
            sum+=power((n%10), (len(t)-j));
            j++;
            n/=10;
        }
        return sum;
    }
    static long isDisarium(long n){
        return (sumPow(n)==n)?1:0;
    }
    static void disRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isDisarium(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void disN(long n){
        long j=0;
        for(long i=1;(i+1)!=0;i++){
            if(isDisarium(i)==1){
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
        long m=10000;
        if(isDisarium(n)==1)
            System.out.println("disarium number");
        else
            System.out.println("not a disarium number");
        disRange(n, m);
        System.out.println("\n");
        disN(15);
    }
}
