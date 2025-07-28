public class numbers {
    static void zero(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void one(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n/2 || (i==n-1 && j>=n/4 && j<=3*n/4) || (i+j==n/2 && i-j<=0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void two(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || (j==n-1 && i<=n/2) || (j==0 && i>=n/2) || i==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void three(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n/2 || i==n-1 || j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void four(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || (i==n/2 && j<=3*n/4) || (j==n/2 && i<=3*n/4))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void five(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || i==n/2 || (j==0 && i<=n/2) || (j==n-1 && i>=n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void six(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n/2 || i==n-1 || j==0 || (j==n-1 && i>=n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void seven(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i+j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void eight(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1 || i==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void nine(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || i==n/2 || j==n-1 ||(j==0 && i<=n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero(7);
        System.out.println();
        one(7);
        System.out.println();
        two(7); 
        System.out.println(); 
        three(7);      
        System.out.println();
        four(7);
        System.out.println();
        five(7);
        System.out.println();
        six(7);
        System.out.println();
        seven(7);
        System.out.println();
        eight(7);
        System.out.println();
        nine(7);
    }
}
