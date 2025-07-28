public class quicksort {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static int partition(int a[],int low,int high){
        int pivot=a[low],i=low+1,j=high;
        pivot=i;
        j=pivot;
        return j;
    }
    static int[] quickSort(int a[],int low,int high){
        return a;
    }
    public static void main(String[] args) {
        int a[]={2,4,3,1,6,7,5,8,9,10,11};
        quickSort(a,0,a.length);
        disp(a);
    }
}
