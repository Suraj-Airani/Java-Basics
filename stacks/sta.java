import java.util.Stack;


public class sta {
    static boolean par(String p){
        Stack<Character> s = new Stack<>();
        for( char c : p.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(s.empty())
                    return false;
                char top=s.peek();
                if(c=='}' && top!='{' ||
                   c==']' && top!='[' ||
                   c==')' && top!='(')
                   return false;
                else
                    s.pop();
            }
        }
        return s.empty();
    }
    public static void main(String[] args) {
        String s="{{[]}";
        System.out.println(par(s));
        
    }
}
