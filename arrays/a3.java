public class a3 {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void sortMerge(int a[],int b[]){
        int i=0,j=0,k=0;
        int c[]=new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while (j<b.length){
            c[k++]=b[j++];
        }
        disp(c);
    }
    static int find(int a[],int k){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==k)
                return c;
            else
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,0,0,0};
        int b[]={2,5,6};
        sortMerge(a,b);
        // System.out.println(find(b, 6));
        // System.out.println(find(a, 5));
    }
}
