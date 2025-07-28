public class abundant {
    static long sumOfFactors(long n){
        long sum=0;
        for(long i=1;i<(n/2)+1;i++){
            if((n%i)==0)
                sum+=i;
        }
        return sum;
    }
    static long isAbundant(long n){
        return (sumOfFactors(n)>n)?1:0;
    }
    static void abunRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isAbundant(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void abunN(long n){
        long j=0;
        for(long i=1;(i+1)!=0;i++){
            if(isAbundant(i)==1){
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
        long m=1001;
        if(isAbundant(n)==1)
            System.out.println("abundant number");
        else
            System.out.println("not abundant number");
        abunRange(n,m);
        System.out.println("\n");
        abunN(50);
    }
}
