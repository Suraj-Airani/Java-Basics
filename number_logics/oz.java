public class oz {
    static void countOZ(long n){
        long zeros=0,ones=0;
        while(n>0){
            if(n%10 == 0){
                zeros++;
                n/=10;
            }
            else if(n%10 == 1){
                ones++;
                n/=10;
            }
            else 
                n/=10;
        }
        System.out.println("zeros : "+zeros);
        System.out.println("ones : "+ones);
    }
    static void countEO(long n){
        long even=0,odd=0;
        while(n>0){
            if((n&1)==0){
                even++;
                n/=10;
            }
            else{    
                odd++;
                n/=10;
            }
        }
        System.out.println("even : "+even);
        System.out.println("odd : "+odd);
    }
    public static void main(String[] args) {
        long n=612543;
        countOZ(n);
        countEO(n);
    }
}
