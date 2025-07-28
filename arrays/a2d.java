import java.util.Scanner;

public class a2d {
    public static void main(String[] args) {
        int a[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int b=sc.nextInt();
                a[i][j]=b;
            }
        }
        sc.close();
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        
    }
}
