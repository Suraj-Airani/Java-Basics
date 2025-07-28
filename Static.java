class Static{
    int x=10;
    int y=20;
        void abc(int n){
            this.x=n;
            this.y=n;
    }
    public static void main(String arg[]){
        Static a =new Static();
        Static b =new Static();
        Static c =new Static();
        a.abc(13);
        b.abc(14);
        c.abc(15);
        System.out.println(a.x+" "+b.x+" "+c.x);
        System.out.println(a.y+" "+b.y+" "+c.y);
    }
}