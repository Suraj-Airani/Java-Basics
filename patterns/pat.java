public class pat {
    static void one(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i-j)==0)
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
                if((i+j)==(n-1))
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
                if((i-j)==0 || i==n-1 || j==0)
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
                if((i-j)==0 || i==0 || j==(n-1))
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
                if(i==0 || j==0 || i==n-1 || j==n-1)
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
                if(i==n/2 || j==n/2)
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
                if(i==0 || j==0 || i==(n-1) || j==(n-1) || (i==n/2 && j==n/2))
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
                if((i-j)==0 || (i+j)==(n-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        one(5);
        System.out.println();
        two(5); 
        System.out.println(); 
        three(5);      
        System.out.println();
        four(5);
        System.out.println();
        five(5);
        System.out.println();
        six(5);
        System.out.println();
        seven(5);
        System.out.println();
        eight(5);
    }
}
    

