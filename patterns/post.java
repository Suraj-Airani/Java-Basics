public class post {
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
    static void p2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=0 && i-j>=0 && i+j<=n-1)
                    System.out.print(n/2-j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i-j>=0 && i+j<=n-1 && i<=n/2)
                    System.out.print(n/2-i+j+" ");
                else if(i>n/2 && i-j>=0 && i+j<=n-1)
                    System.out.print(-(n/2-i-j)+" ");
            }
            System.out.println();
        }
    }
    static void p4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=0 && i-j>=0 && i+j<=n-1)
                    System.out.print((char)(65+n/2-j)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i-j>=0 && i+j<=n-1 && i<=n/2)
                    System.out.print((char)(65+n/2-i+j)+" ");
                else if(i>n/2 && j>=0 && i-j>=0 && i+j<=n-1)
                    System.out.print((char)(65-(n/2-i-j))+" ");
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
    static void p7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print(j-n/2+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print((char)(65+j-n/2)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p9(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print("* ");
                else 
                    System.out.print(" ");   
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
    static void p11(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print(1+i+j-n+1+" ");
                else 
                    System.out.print(" ");   
            }
            System.out.println();
        }
    }
    static void p12(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print((char)(65+i)+" ");
                else 
                    System.out.print(" ");   
            }
            System.out.println();
        }
    }
    static void p13(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print((char)(65+i+j-n+1)+" ");
                else 
                    System.out.print(" ");   
            }
            System.out.println();
        }
    }
    static void p14(int n){
        for(int i=n/2;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print("* ");
                else 
                    System.out.print(" ");   
            }
            System.out.println();
        }
    }
    static void p15(int n){
        for(int i=n/2;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print(n-i+" ");
                else 
                    System.out.print(" ");   
            }
            System.out.println();
        }
    }
    static void p16(int n){
        for(int i=n/2;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print((char)(65+n-1-i)+" ");
                else 
                    System.out.print(" ");   
            }
            System.out.println();
        }
    }
    static void p17(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0)
                    System.out.print("* ");
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
    static void p19(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i-j<=0 && i<=n/2)
                    System.out.print((char)(65+i)+" ");
                else if(i>n/2 && i+j>=n-1 && i-j<=0)
                    System.out.print((char)(65+n-1-i)+" "); 
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void p20(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p21(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2)
                    System.out.print(i+1+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p22(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2)
                    System.out.print(n/2+1-i+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p23(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2)
                    System.out.print((char)(65+i)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p24(int n){
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2)
                    System.out.print((char)(65+n/2-i)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p25(int n){
        for(int i=n/2;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==3*(n/2) || i-j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p26(int n){
        for(int i=n/2;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==3*(n/2) || i-j==n/2)
                    System.out.print(i-n/2+1+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p27(int n){
        for(int i=n/2;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==3*(n/2) || i-j==n/2)
                    System.out.print(n-i+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p28(int n){
        for(int i=n/2;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==3*(n/2) || i-j==n/2)
                    System.out.print((char)(65+i-n/2)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p29(int n){
        for(int i=n/2;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==3*(n/2) || i-j==n/2)
                    System.out.print((char)(65+n-1-i)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p30(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2 || i+j==3*(n/2) || i-j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p31(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2)
                    System.out.print(i+1+" ");
                else if(i+j==3*(n/2) || i-j==n/2)
                    System.out.print(n-i+" ");
                else    
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p32(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2)
                    System.out.print(n/2+1-i+" ");
                else if(i+j==3*(n/2) || i-j==n/2)
                    System.out.print((-n/2+i+1)+" ");
                else    
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p33(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2)
                    System.out.print((char)(65+i)+" ");
                else if(i+j==3*(n/2) || i-j==n/2)
                    System.out.print((char)(65+n-1-i)+" ");
                else    
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void p34(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n/2 || i-j==-n/2)
                    System.out.print((char)(65+n/2-i)+" ");
                else if(i+j==3*(n/2) || i-j==n/2)
                    System.out.print((char)(65+i-n/2)+" ");
                else    
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println();
        p1(7);
        // System.out.println();
        // p2(7);
        // System.out.println();
        // p3(7);
        // System.out.println();
        // p4(7);
        // System.out.println();
        // p5(7);
        System.out.println();
        p6(7);
        // System.out.println();
        // p7(7);
        // System.out.println();
        // p8(7);
        // System.out.println();
        // p9(9);
        // System.out.println();
        p10(9);
        System.out.println();
        // p11(9);
        // System.out.println();
        // p12(9);
        // System.out.println();
        // p13(9);
        // System.out.println();
        p14(9);
        System.out.println();
        // p15(9);
        // System.out.println();
        // p16(9);
        // System.out.println();
        // p17(9);
        // System.out.println();
        p18(9);
        System.out.println();
        // p19(9);
        // System.out.println();
        // p20(9);
        // System.out.println();
        // p21(9);
        // System.out.println();
        // p22(9);
        // System.out.println();
        // p23(9);
        // System.out.println();
        // p24(9);
        // System.out.println();
        // p25(9);
        // System.out.println();
        // p26(9);
        // System.out.println();
        // p27(9);
        // System.out.println();
        // p28(9);
        // System.out.println();
        // p29(9);
        // System.out.println();
        // p30(9);
        // System.out.println();
        // p31(9);
        // System.out.println();
        // p32(9);
        // System.out.println();
        // p33(9);
        // System.out.println();
        // p34(9);
        // System.out.println();
    }
}
