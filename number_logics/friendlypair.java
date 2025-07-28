public class friendlypair {
    static long sumOfFactors(long n){
        long sum=0;
        for(long i=1;i<(n/2)+1;i++){
            if((n%i)==0)
                sum+=i;
        }
        return sum;
    }
    static void isFriPair(long a, long b){
        if((sumOfFactors(a)==b)||(sumOfFactors(b)==a))
            System.out.println("friendly pair");
        else
            System.out.println("not a friendly pair");
    }
    public static void main(String[] args) {
        long n=5020;
        long m=5564;
        isFriPair(n, m);
    }
}
