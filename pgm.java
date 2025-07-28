class pgm{
    static int sum( int a, int b){
        return a+b;
    }
    static void sum(int a){
        System.out.println(a);
    }
    static void sum(){
        System.out.println(10+20+30);
    }
    static int sum1(){
        return 10+20+65;
    }
        public static void main(String arg[]){
        System.out.println(sum(10,20));//with arg with rtn
        sum(10); //with arg no rtn
        sum();  //no arg no rtn
        System.out.println(sum1()); 
    }
}