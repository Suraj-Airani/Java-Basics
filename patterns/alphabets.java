public class alphabets {
    static void A(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || j==n-1 || i==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void B(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || j==n-1 || i==n-1 || i==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void C(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void D(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || j==n-1 || i==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void E(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || i==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void F(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || ((i==n/2) && (j<=n/2)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void G(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || (i==n-1 && j<=3*n/4) || (j==3*n/4 && i>=n/2) || (i==n/2 && j>=n/2 && j<=3*n/4) || (j==n/2 && i>=n/2 && i<=3*n/4) ||
                  (i==3*n/4 && j<=n/2 && j>=n/4) || (j==n/4 && i>=n/4 && i<=3*n/4) || (i==n/4 && j>=n/4) || (j==n-1 && i>=n/4))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void H(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void I(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0 && j>=n/4 && j<=3*n/4) || (i==n-1 && j>=n/4 && j<=3*n/4) || j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void J(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==n/2 || (i==n-1 && j<=n/2) || (j==0 && i>=n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void K(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i+j==n/2 || i-j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void L(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void M(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || (i+j==n-1 && i-j<=0) || (i-j==0 && i+j<=n-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void N(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i-j==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void O(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==n-1 || i==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void P(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n/2 || (j==n-1 && i<=n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void Q(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j== n-1 || (i-j==0 && i+j>=n-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void R(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || (i==0 && j<=n/2) || (j==n/2 && i<=n/2) || (i==n/2 && j<=n/2) || i-j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void S(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || (j==0 && i<=n/2) || (j==n-1 && i>=n/2) || (i==n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void T(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void U(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void V(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((j==0 && i<=n/2) || (j==n-1 && i<=n/2) || i-j==n/2 || i+j==3*n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void W(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || (i+j==n-1 && i-j>=0) || (i-j==0 && i+j>=n-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void X(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1 || i-j==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void Y(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j==n-1 && i-j<=0) || (i-j==0 && i+j<=n-1) || (j==n/2 && i>=n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void Z(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || i+j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // A(7);
        // System.out.println();
        // B(7);
        // System.out.println();
        // C(7);
        // System.out.println();
        // D(7);
        // System.out.println();
        // E(7);
        // System.out.println();
        // F(7);
        System.out.println();
        G(17);
        System.out.println();
        // H(7);
        // System.out.println();
        // I(7);
        // System.out.println();
        // J(7);
        // System.out.println();
        // K(7);
        // System.out.println();
        // L(7);
        // System.out.println();
        // M(7);
        // System.out.println();
        // N(7);
        // System.out.println();
        // O(7);
        // System.out.println();
        // P(7);
        // System.out.println();
        // Q(7);
        // System.out.println();
        // R(7);
        // System.out.println();
        // S(7);
        // System.out.println();
        // T(7);
        // System.out.println();
        // U(7);
        // System.out.println();
        // V(8);
        // System.out.println();
        // W(7);
        // System.out.println();
        // X(7);
        // System.out.println();
        // Y(7);
        // System.out.println();
        // Z(7);
    }
}
