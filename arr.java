// finding subset sum

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter array elements: ");
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            a[i]=b;
        }
        System.out.print("enter subset size: ");
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        sc.close();
        int maxSum=sum;
        for(int i=k;i<n;i++){
            sum=sum-a[i-k]+a[i];
            maxSum=Math.max(sum, maxSum);
        }
        System.out.println("max sum is: "+maxSum);
    }    
}
