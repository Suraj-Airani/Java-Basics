public class bubblesort {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
                }  
            }
        }
        disp(a);
    }   
    public static void main(String[] args) {
        int a[]={65,90,97,122,32,48,57};
        sort(a);
    }
}
