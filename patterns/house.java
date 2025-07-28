public class house {
    static void house1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2 || (i==n-1 && j<=n/8) || (i==n-1 && j>=3*n/8) || (j==0 && i>=n/2) || (j==n-1 && i>=n/2) || i+j==n/2 || i-j==-n/2 ||
                   (i==5*n/8 && j>=n/8 && j<=3*n/8) || (i==5*n/8 && j>=5*n/8 && j<=7*n/8) || (j==n/8 && i>=5*n/8) || (j==3*n/8 && i>=5*n/8)||
                   (i==7*n/8 && j>=5*n/8 && j<=7*n/8) || (j==5*n/8 && i>=5*n/8 && i<=7*n/8) || (j==7*n/8 && i>=5*n/8 && i<=7*n/8) ||
                   (j==6*n/8 && i>=5*n/8 && i<=7*n/8) || (i==6*n/8 && j>=5*n/8 && j<=7*n/8) || (j==5*n/8 && i<=n/8) || (j==7*n/8 && i<=3*n/8) ||
                   (i==0 && j>=5*n/8 && j<=7*n/8))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        house1(25);
    }
}
