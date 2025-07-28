class Stack {
    int n=5;
    int stack[]=new int[n];
    int top=-1;
   
    void push(int data){
        if(isfull()){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=data;
        System.out.println(stack[top]+" is pushed.");
    }
   
    void pop(){
        if(isempty()){
            System.out.println("Stack is empty / Stack Underflow");
            return;
        }
        System.out.println(stack[top--]+" is popped");
    }
   
    void peek(){
        if(isempty()){
            System.out.println("Stack is empty / Stack Underflow");
            return;
        }
        System.out.println(stack[top]+" is @ peek");
    }
   
    boolean isfull(){
        return top==n-1;
    }
   
    boolean isempty(){
        return top==-1;
    }
   
    void disp(){
        if(isempty()){
            System.out.println("Stack is empty / Stack Underflow");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]+" is @ "+(i+1));
        }
    }
}
public class data{
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.push(80);
        s.pop();
        s.pop();
        s.push(27);
        s.peek();
        s.pop();
        s.push(10);
        s.push(20);
        s.push(30);
        s.disp();
    }
}