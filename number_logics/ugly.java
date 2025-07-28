public class ugly {
    static long isUgly(long n){
        if(n==1)
            return 1;
        else if(((n%2)==0)||((n%3)==0)||((n%5)==0))
            return 1;
        else 
            return 0;
    }
    public static void main(String[] args) {
        long n=14;
        if(isUgly(n)==1)
            System.out.println("ugly number");
        else
            System.out.println("not a ugly number");
            
    }
}
