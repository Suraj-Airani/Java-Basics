public class harshad {
    static long sumDigits(long n){
        long sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    static long isHarshad(long n){
        return (n%sumDigits(n)==0)?1:0;
    }
    static void harshadRange(long a,long b){
        for(long i=a;i<b+1;i++){
            if(isHarshad(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    static void harshadN(long n){
        long j=0;
        for(long i=1;(i+1)!=0;i++){
            if(isHarshad(i)==1){
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
        if(isHarshad(m)==1)
            System.out.println("harshad");
        else
            System.out.println("not a harshad");
        harshadRange(n, m);
        System.out.println("\n");
        harshadN(14);
    }
}
