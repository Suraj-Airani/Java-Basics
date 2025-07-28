public class smith {
    static boolean isPrime(int n){
        if(n<2)
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i=5;(i*i)<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    static int sumDigits(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    static int sumOfPrime(int n){
        int sum=0;
        for(int i=2;n>1;i++){
            if(isPrime(i)){

                while(n%i==0){
                    n/=i;
                    if(i>10)
                        sum+=sumDigits(i);
                    else
                        sum+=i;
                }
            }
        }
        return sum;
    }
    static int isSmith(int n){
        if(sumDigits(n)==sumOfPrime(n))
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        // System.out.println(isPrime(2));
        int n=85;
        if(isSmith(n)==1)
            System.out.println("smith");
        else
            System.out.println("not");
    }
}
