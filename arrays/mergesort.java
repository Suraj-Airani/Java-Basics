import java.util.ArrayList;
import java.util.List;

public class mergesort {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    // static void merge(int[] a, int start, int mid, int end){ // wihtout using arraylist
    //     int n1 = mid-start+1;
    //     int n2 = end-mid;
    //     int[] L = new int[n1];
    //     int[] R = new int[n2];
    //     for (int i = 0; i < n1; ++i)
    //         L[i] = a[start + i];
    //     for (int j = 0; j < n2; ++j)
    //         R[j] = a[mid + 1 + j];
        
    //     int i=0,j=0;
    //     int k = start;
    //     while (i < n1 && j < n2) {
    //         if (L[i] <= R[j]) {
    //             a[k] = L[i];
    //             i++;
    //         }
    //         else {
    //             a[k] = R[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while (i < n1) {
    //         a[k] = L[i];
    //         i++;
    //         k++;
    //     }
    //     while(j < n2){
    //         a[k] = R[j];
    //         j++;
    //         k++;
    //     }
    // }

    static void merge(int[] a, int start, int mid, int end){ // tc:O(n)
        List<Integer> temp = new ArrayList<>();
        int i=start, j=mid+1;
        while(i<=mid && j<=end){
            if(a[i]<=a[j]){
                temp.add(a[i]);
                i++;
            }
            else{
                temp.add(a[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(a[i]);
            i++;
        }
        while(j<=end){
            temp.add(a[j]);
            j++;
        }
        for(int idx=0;idx<temp.size();idx++){
            a[idx+start]=temp.get(idx);
        }
    }
    static void mergeSort(int[] a, int start, int end){
        if(start < end){
            int mid = start + (end-start)/2;
            mergeSort(a, start, mid); // left part
            mergeSort(a, mid+1, end); // right part
            merge(a, start, mid, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {65,90,97,122,32,48,57};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        disp(arr);
    }
}
