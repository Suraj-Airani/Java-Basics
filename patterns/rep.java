public class rep {
    static void p1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=0 && i-j>=0 && i+j<=n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p10(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print(i+1+" ");
                else 
                    System.out.print(" ");   
            }
            System.out.println();
        }
    }
    static void p18(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0 && i<=n/2)
                    System.out.print(i+1+" ");
                else if(i>n/2 && i+j>=n-1 && i-j<=0)
                    System.out.print(n-i+" "); 
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println();
        p1(7);
        System.out.println();
        p6(7);
        System.out.println();
        p10(9);
        System.out.println();
        p18(9);
        System.out.println();
    }
}
