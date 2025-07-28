public class pdf {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static int avg(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
    static void merge(int a[],int b[]){
        int n1=a.length,n2=b.length;
        for(int i=0;i<n1+n2;i++){
            if(i<n1)
                System.out.print(a[i]+" ");
            else
                System.out.print(b[i-n1]+" ");
        }
    }
    static void moveZerosEnd(int a[]){
        int n=a.length;
        int i=0,j=n-1;
        while(i<n && j>0 && i<j){
            if(a[j]!=0){
                if(a[i]==0){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                    i++;j--;
                }
                else
                    i++;
            }
            else
                j--;
        }
        disp(a);
    }
    static boolean checkPalindrome(int a[]){
        int i=0,j=a.length-1;
        while(i<j){
            if(a[i]==a[j]){
                i++;j--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // int a[]={65,90,97,122,32,48,57};
        // int b[]={2,3,0,4,8,0,0,9,5,6,0,10,0};
        // int c[]={1,2,3,4,5,5,4,3,2,1};
        // System.out.println(avg(a));
        // merge(a, b);
        // moveZerosEnd(b);
        // System.out.println(checkPalindrome(c));
    }
}
