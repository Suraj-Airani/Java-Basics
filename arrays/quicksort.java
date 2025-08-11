public class quicksort {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static int partition(int a[],int start,int end){
        int idx=start-1,pivot=a[end];
        for(int j=start;j<end;j++){
            if(a[j]<=pivot){
                idx++;
                a[idx]=a[idx]+a[j]-(a[j]=a[idx]); //swap(a[idx],a[j])
            }
        }
        idx++;
        a[idx]=a[idx]+a[end]-(a[end]=a[idx]); //swap(a[idx],a[j])
        return idx;
    }
    static void quickSort(int a[],int start,int end){ // O(nlogn)
        if(start<end){
            int pivot = partition(a, start, end);
            quickSort(a, start, pivot-1);
            quickSort(a, pivot+1, end); 
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,3,1,6,7,5,8,9,10,11};
        quickSort(a,0,a.length-1);
        disp(a);
    }
}
