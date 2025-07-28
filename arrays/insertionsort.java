public class insertionsort {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void sort(int a[]){
        int n=a.length;
        int i,j;
        for(i=1;i<n;i++){
            int t=a[i];
            for(j=i-1;(j>=0 && a[j]>t);j--){
                a[j+1]=a[j];
            }
            a[j+1]=t;        
        }
        disp(a);
    }
    public static void main(String[] args) {
        int a[]={65,90,97,122,32,48,57};
        sort(a);
    }
}
