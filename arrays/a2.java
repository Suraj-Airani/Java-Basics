public class a2 {
    static void disp(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void swapArr(int a[]){
        for(int i=0;i<a.length-1;i+=2){
                a[i]=a[i]+a[i+1]-(a[i+1]=a[i]);
            }
    }
    static void rev(int a[],int i,int j){
        while(i<j){
            a[i]=a[i]+a[j]-(a[j]=a[i]);
            i++;
            j--;
        }
        disp(a);
    }
    static void eoComb(int a[]){
        int i=0,j=1;
        while(i<a.length && j<a.length){
            if((a[i]&1)!=0){
                if((a[j]&1)==0){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                    i++;j++;
                }
                else
                    j++;
            }
            else
                i++;
        }
        disp(a);
    }
    static void eoIndexComb(int a[]){
        int eo[]=new int[a.length];
        int i=0;
        for(int k=0;k<a.length;k+=2){
                eo[i]=a[k];
                i++;
        }
        for(int k=1;k<a.length;k+=2){
                eo[i]=a[k];
                i++;
        }
        disp(eo);
    }
    static void larsma(int a[]){
        int max[]=new int[3];
        for(int i=0;i<a.length;i++){
            if(a[i]>max[0]){
                max[2]=max[1];
                max[1]=max[0];
                max[0]=a[i];
            }
            else if(a[i]>max[1] && a[i]<max[0]){
                max[2]=max[1];
                max[1]=a[i];
            }
            else if(a[i]>max[2] && a[i]<max[1]){
                max[2]=a[i];
            }
        }
        disp(max);
        int min[]=new int[3];
        min[0]=max[0];
        min[1]=max[1];
        min[2]=max[2];
        for(int i=0;i<a.length;i++){
            if(a[i]<min[0]){
                min[2]=min[1];
                min[1]=min[0];
                min[0]=a[i];
            }
            else if(a[i]<min[1] && a[i]>min[0]){
                min[2]=min[1];
                min[1]=a[i];
            }
            else if(a[i]<min[2] && a[i]>min[1]){
                min[2]=a[i];
            }
        }
        disp(min);
    }
    static void modDiv(int a[]){
        int r[]=new int[a.length];
        int q[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            r[i]=a[i]%a.length;
            q[i]=a[i]/a.length;
        }
        disp(r);
        System.out.println();
        disp(q);
    }
    static void antiRotate(int a[],int k){
        int n=a.length;
        k=k%n;
        for(int i=0;i<k;i++){
            int temp=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=temp;
        }
        disp(a);
    }
    static void clockRotate(int a[],int k){
        int n=a.length;
        k=k%n;
        for(int i=0;i<k;i++){
            int temp=a[n-1];
            for(int j=n-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        disp(a);
    }
    static void rightRotate(int a[],int k){
        int n=a.length;
        k=k%n;
        rev(a, n-k, n-1);
        rev(a, 0, n-1-k);
        rev(a, 0, n-1);
    }
    static void leftRotate(int a[],int k){
        int n=a.length;
        k=k%n;
        rev(a, 0, k-1);
        rev(a, k, n-1);
        rev(a, 0, n-1);
    }
    public static void main(String[] args) {
        int a[]={65,90,97,122,32,48,57};
        // int n=a.length;
        disp(a);
        // swapArr(a);
        // disp(a);
        // rev(a,0,n-1);
        // eoComb(a);
        // eoIndexComb(a);
        // flPair(a);
        // modDiv(a);
        larsma(a);
        // antiRotate(a, 2);
        // clockRotate(a, 2);
        // rightRotate(a, 2);
        // leftRotate(a, 2);
    }
}
