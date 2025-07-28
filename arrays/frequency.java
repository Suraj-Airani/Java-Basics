public class frequency {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static int freq(int a[],int k){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==k)
                c++;
        }
        return c;
    }
    static int max(int a[]){
        int val=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>val)
                val=a[i];
        }
        return val;
    }
    static void freqEach(int a[]){
        int m=max(a)+1;
        int b[]=new int [m];
        for(int i=0;i<a.length;i++){
            b[a[i]]++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]!=0){
                System.out.println(i+" -> "+b[i]);
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,1,1,2,3,5,8,7,9};
        // System.out.println(freq(a,1));
        freqEach(a);
    }
}
