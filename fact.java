class fact{
    public static void main(String s[]){
        int n = 5;
        int fact=1;
        for(int i = 2; i < n+1; i ++){
            int temp = 0;
            for(int j=0; j<i; j++){
                temp = temp + fact;
            }
            fact = temp;
        }
        System.out.println(fact);
    }
}