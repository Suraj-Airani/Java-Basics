public class post1 {
    static void p35(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j<=n/2 || i-j<=-n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void p36(int n){
        for(int i=n/2;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=3*(n/2) || i-j>=n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void p37(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j>=n-1 && i-j<=0) || (i+j<=n-1 && i-j>=0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void p38(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if((i+j>=n-1 && i-j<=0) || (i+j<=n-1 && i-j>=0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void p39(int n){
        for(int i=0;i<=n/2;i++){
            for(int k=0;k<2;k++){
                for(int j=0;j<n;j++){
                    if(i+j>=n-1)
                        System.out.print("* ");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    // static void p40(int n){
    //     for(int i=0;i<n;i++){
    //         for(int k=0;k<4;k++){
    //             for(int j=0;j<n*2;j++){
    //                 if(i+j==n-1) //j>=n/2
    //                     System.out.print("/");
    //                 else if(i-j==-n)
    //                     System.out.print("\\");
    //                 else
    //                     System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        System.out.println();
        // p35(9);
        // p36(9);
        // p37(7);
        // p38(7);
        p39(9);
    }
}
