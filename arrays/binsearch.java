public class binsearch {
    static void search(int a[],int t){
        int s=0,e=a.length-1;
        int c=0;
        while(s<=e){
            c++;
            int mid=(s+e)/2;
            if(a[mid]==t){
                System.out.println(t+" found @ "+mid);
                break;
            }
            else if(t>a[mid]){
                s=mid+1;
            }
            else if(t<a[mid]){
                e=mid-1;
            }
            else{
                System.out.println(t+" not found ");
            }
        }
        System.out.println("count: "+c);
    }
    public static void main(String[] args) {
        int a[]=new int[500];
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        search(a, 233);
    }
}