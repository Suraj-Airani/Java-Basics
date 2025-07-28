import java.util.Scanner;

class demo{
    public static void main(String a[]){
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i<11*n;i+=n){
            System.out.println(i);
        }
    }
}