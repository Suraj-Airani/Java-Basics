class Node{
    int data;
    Node add;
    Node(int data){
        this.data=data;
    }
}

class linkedlist{
    Node root;
   
    void append(int data){
        Node n=new Node(data);
       
        if(root==null){
            root=n;
            return;
        }
        Node x=root;
        while(x.add!=null){
            x=x.add;
        }
        x.add=n;
        return;
    }
   
    int len(){
        int c=0;
        Node x=root;
        while(x!=null){
            x=x.add;
            c++;
        }
        return c;
    }
   
    void disp(){
        Node x=root;
        int i=0;
        System.out.println("Node\t\tindex\tdata\tadd");
        System.out.println("*************************************");
        while(x!=null){
            System.out.println(x+"\t"+(i++)+"\t"+x.data+" \t"+x.add);
            x=x.add;
        }
       
    }
   
    void ele(int i){
        if(i>=len()){
            System.out.println("Index out of reange");
            return;
        }
        Node x=root;
        while(i>0 ) {
            if(x!=null)
                x=x.add;
            i--;
        }
        System.out.println(x+" "+x.data+" "+x.add);
    }

    void insertFirst(int data){         //inserting at the beginning of the linked list
        Node n=new Node(data);

        Node x=root;
        root=n;
        root.add=x;
    }
   
    void insert(int i,int data){        //inserting in specified index of the linked list
        Node n=new Node(data);
       
        Node x=root;

        int j=0;
        while(j<i-1){   
            x=x.add;
            j++;
        }
        n.add=x.add;
        x.add=n;
    }

    void insertEnd(int data){       //inserting at the end of the linked list
        Node n=new Node(data);
       
        Node x=root;
        while(x.add!=null)
            x=x.add;
        x.add=n;
    }

    void delete(int i){
        Node x=root;
        if(i==0){       //deleting first node
            root=x.add;
            return;
        }

        while(i!=1){    //deleting node at specified index
            x=x.add;
            i--;
        }
        Node y=x.add;
        x.add=y.add;
    }

    void search(int t){
        Node x=root;
        int i=0;
        while(x!=null){
            if(x.data==t){
                System.out.println(t+" found @ "+i);
                return;
            }
            i++;
            x=x.add;
        }
        System.out.println(t+" not found");
    }

    void sort(){
        for(Node i=root ; i!=null ; i=i.add){
            for(Node j=i.add ; j!=null ; j=j.add){
                if(i.data > j.data){
                    i.data=i.data+j.data-(j.data=i.data);
                }
            }
        }
    }

    void insort(){
        Node i,j;
        for(i=root;i!=null;i=i.add){
            int t=i.add.data;
            for(j=i;(j!=null && j.data>t);j=j.add){
                j.add.data=j.data;
            }
            j.add.data=t;
        }
    }

    void rev(){
        Node pre=null;
        Node x=root;
        Node nxt=null;
       
        while(x!=null){
            nxt=x.add;
            x.add=pre;
            pre=x;
            x=nxt;
        }
        root=pre;
    }
}

public class sll{
    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        l.append(10);
        l.append(20);
        l.append(30);
        l.append(40);
        l.append(50);
        l.append(60);
        l.insertFirst(200);
        l.insert(7,27);
        l.insertEnd(45);
        l.disp();
        System.out.println();
        l.delete(0);
        l.delete(5);
        l.disp();
        System.out.println();
        l.search(40);
        System.out.println();
        // l.insort();
        l.disp();
        // System.out.println();
        // l.rev();
        // l.disp();
    }
}
