
public class cll {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    void append(int v){
        Node n=new Node(v);

        if(head==null){
            head=n;
            head.next=head;
            return;
        }
        Node x=head;
        while(x.next!=head)
            x=x.next;
        x.next=n;
        n.next=head;
    }

    void rev(){
        Node nxt=head.next;
        Node x=head;
        while(x.next!=head)
            x=x.next;
        Node prev=x;
        x=head;
        do{
            nxt=x.next;
            x.next=prev;
            prev=x;
            x=nxt;
        }while(x!=head);
        head=prev;
    }

    void disp(){
        Node x=head;
        int i=0;
        System.out.println("Node\t\t\tindex\tdata\tnext");
        System.out.println("**********************************************************");
        if(head==null)
            return;
        do{
            System.out.println(x+"\t"+(i++)+"\t"+x.data+"\t"+x.next);
            x=x.next;
        }while(x!=head);
    }

    public static void main(String[] args) {
        cll l=new cll();
        l.append(45);
        l.append(12);
        l.append(56);
        l.disp();
        System.out.println();
        l.rev();
        l.disp();
    }
}
