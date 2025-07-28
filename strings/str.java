public class str {
    static void disp(char a[]){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
        System.out.println();
    }
   
    static void rev(char a[],int i,int j){
        while(i<j){
            // char t=a[i];
            // a[i]=a[j];
            // a[j]=t;
            a[i]=(char)(a[i]+a[j]-(a[j]=(char)(a[i])));
            i++;j--;
        }
        disp(a);
    }
    static void revEachWord(char a[]){
        int s=0;
        for(int i=0;i<a.length;i++){
            if(i==a.length-1 || a[i+1]==' '){
                rev(a, s, i);
                s=i+2;
            }
        }
        disp(a);
    }
    static void count(char a[]){
        int c=1,n=a.length;
        for(int i=0;i<n;i++){
            if(i==n-1 || a[i+1]==' '){
                a[i]=(char)(c+48);
                c=0;
            }
            else
                c++;
        }
        disp(a);
    }
    static void countEven(char a[]){
        int c=1,n=a.length;
        for(int i=0;i<n;i++){
            if(i==n-1 || a[i+1]==' '){
                a[i]=(char)(c+48);
                c=0;
            }
            else
                c++;
        }
        disp(a);
    }
    static boolean isVowel(char a){
        char v[]={'a','e','i','o','u'};
        for(int i=0;i<5;i++){
            if(v[i]==a)
                return true;
        }
        return false;
    }
    static String upVowels(char a[]){
        for(int i=0;i<a.length;i++){
            if(isVowel(a[i]))
                a[i]-=' ';
        }
        return toStr(a);
    }
    static void upNextVowels(char a[]){
        for(int i=0;i<a.length;i++){
            switch (a[i]) {
                case 'a':
                    a[i]='E';break;
                case 'e':
                    a[i]='I';break;
                case 'i':
                    a[i]='O';break;
                case 'o':
                    a[i]='U';break;
                case 'u':
                    a[i]='A';break;
            }
        }
        disp(a);
    }
    static void swap2(char a[],int i,int j){
        for(int k=i;k<j;k+=2){
            a[k]=(char)(a[k]+a[k+1]-(a[k+1]=(char)(a[k])));
        }
        // disp(a);
    }
    static void adjSwap(char a[]){
        int s=0;
        for(int i=0;i<a.length;i++){
            if(i==a.length-1 || a[i+1]==' '){
                swap2(a, s, i);
                s=i+2;
            }
        }
        disp(a);
    }
    static void flChar(char a[]){
        int s=0;
        for(int i=0;i<a.length;i++){
            if(i==a.length-1 || a[i+1]==' '){
                a[s]='@';
                a[i]='#';
                s=i+2;
            }
        }
        disp(a);
    }
    static void flCharSwap(char a[]){
        int s=0;
        for(int i=0;i<a.length;i++){
            if(i==a.length-1 || a[i+1]==' '){
                a[s]=(char)(a[s]+a[i]-(a[i]=(char)(a[s])));
                s=i+2;
            }
        }
        disp(a);
    }
    static void p11(char a[]){
        System.out.print(a[0]);
        for(int i=1;i<a.length;i++){
            if(a[i-1]==' '){
                System.out.print(a[i]);
            }
            System.out.print("");
        }
    }
    static String toStr(char a[]){
        String s="";
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    static String toUpper(char a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]>=97 && a[i]<=122)
                a[i]-=' '; 
        }
        return toStr(a);
    }
    static void toLower(char a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]>=65 && a[i]<=90)
                a[i]+=' ';
        }
        disp(a);
    }
    static void swapCase(char a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]>=65 && a[i]<=90)
                a[i]+=' ';
            else if(a[i]>=97 && a[i]<=122)
                a[i]-=' ';
        }
        disp(a);
    }
    static void sort(char a[],int i,int n){
       
        for(;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                if(a[i]>a[j])
                    a[i]=(char)(a[i]+a[j]-(a[j]=(char)(a[i]))); //swap
            }
        }
    }
    static String sortEachWord(char a[]){
        int s=0;
        for(int i=0;i<a.length;i++){
            if(i==a.length-1 || a[i+1]==' '){
                sort(a, s, i);
                s=i+2;
            }
        }
        return toStr(a);
    }
    static int noOfWords(char a[]){
        int c=1;
        for(int i=0;i<a.length;i++){
            if(a[i]==' ' || a[i]==a.length-1){
                c++;
            }
        }
        return c;
    }
    static void task(String s){
        boolean flag=true;
        String str="";
        for(char c:s.toCharArray()){
            if((c>=65 && c<=90) || (c>=97 && c<=122)){
                if(flag)
                    str+=(char)(c-1);
            }
        }
        System.out.println(str);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        
        for(int i=0;i<word1.length;i++)
            {s1+=word1[i];}

        for(int i=0;i<word2.length;i++)
            {s2+=word2[i];}

        System.out.println(s1);
        System.out.println(s2);
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();

        for(char i=0;(i<c1.length) && i<(c2.length);i++){
            if(c1[i]!=c2[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="what is your name";
        String s1[]={"a","bc"};
        String s2[]={"ab","c"};
        char ch[]=s.toCharArray();
        // disp(ch);
        // rev(ch, 0, ch.length-1);
        // revEachWord(ch);
        // count(ch);
        // flChar(ch);
        // flCharSwap(ch);
        // adjSwap(ch);
        // countEven(ch);
        // System.out.println(upVowels(ch));
        // upNextVowels(ch);
        // p11(ch);
        // System.out.println(toUpper(ch));
        // toLower(ch);
        // swapCase(ch);
        // System.out.println(noOfWords(ch));
        // sort(ch, 0, ch.length-1);
        System.out.println(sortEachWord(ch));
        // task(s);
        System.out.println(arrayStringsAreEqual(s1,s2));
    }
}
