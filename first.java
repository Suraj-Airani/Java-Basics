public class first {
    static int i;
    static void seq(int n){
        if(n<4){
            System.out.print(n+" ");
            seq(n+1);
        }
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        seq(i);
    }
}