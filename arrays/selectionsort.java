public class selectionsort {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
        disp(a);
    }
    static void sort(int a[],int i,int n){
        for(;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
        disp(a);
    }
    static void sort1(int a[]){
        for(int i=a.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(a[i]<a[j]){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
        disp(a);
    }
    
    public static void main(String[] args) {
        int a[]={9,8,7,6,5,4,3,2,1};
        int n=a.length;
        // sort(a);
        // sort1(a);
        sort(a, n/2, n);
    }
}
