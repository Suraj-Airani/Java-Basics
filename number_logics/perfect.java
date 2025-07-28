public class perfect {
    static long sumOfFactors(long n){
        long sum=0;
        for(long i=1;i<=(n/2);i++){
            if((n%i)==0)
                sum+=i;
        }
        return sum;
    }
    static long isPerfect(long n){
        return (n==sumOfFactors(n))?1:0;
    }
    static void perfRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isPerfect(i)==1)
                System.out.print(i+" ");
        }
    }
    static void perfN(long n){
        long j=0;
        for(long i=1;true;i++){
            if(isPerfect(i)==1){
                j++;
                if(j==(n)){
                    System.out.println(i);
                    break;
                }
            } 
        }
    }
    public static void main(String[] args) {
        long n=1;
        long m=100000;
        if(isPerfect(n)==1)
            System.out.println("perfect number");
        else
            System.out.println("not a perfect number");
        perfRange(n, m);
        System.out.println("\n");
        perfN(5);
    }
}
