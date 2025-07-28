class Stack {
    int n;
    char stack[];
    int top=-1;
   
    public Stack(){
        stack=new char[5];
        n=5;
    }
    public Stack(int size){
        stack=new char[size];
        n=size;
    }
   
   
    void push(char data){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        stack[++top]=data;
        // System.out.println(stack[top]+" is pushed");
    }
   
    void pop(){
        if(isEmpty()){
            //System.out.println("no element to pop, stack is empty");
            return;
        }
        top--;
       
    }
   
    char peek(){
        if(isEmpty()){
            System.out.println("no element @ peek, stack is empty");
            return '0';
        }
        return stack[top];
        //System.out.println(stack[top]+" is @ peek");
    }
   
    boolean isFull(){
        return top==n-1;
    }
   
    boolean isEmpty(){
        return top==-1;
    }
   
    void disp(){
        if(isEmpty()){
            System.out.println("no element to disp");
            return;
        }
        for(int i=0;i<top+1;i++){
            System.out.println(stack[i]+" is inserted "+(i+1));
        }
    }
}
public class valid{
   
    static boolean par(String p){
        Stack s=new Stack(p.length());
        for( char c : p.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(s.isEmpty())
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
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String s="[][]";
        if(par(s))
            System.out.println(s+" is a valid");
        else
            System.out.println(s+" is invalid");
    }
}