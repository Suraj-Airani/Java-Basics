import java.util.*;

public class anagram {
    
    static boolean isValid(String s1,String s2){
        int c[]=new int[26];
        boolean flag=true;
        
        for(char ch:s1.toCharArray())
            c[ch-'a']++;
        
        for(char ch:s2.toCharArray())
            c[ch-'a']--;
        
        for(int i=0;i<26;i++){
            if(c[i]!=0)
                flag=false;
        }
        
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(isValid(s1,s2));
        sc.close();
    }
}
