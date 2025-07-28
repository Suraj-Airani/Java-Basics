public class dll {
    Node head;

    class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    void insertFirst(int v){        //inserting at the beginning
        Node n=new Node(v);

        if(head==null)
            head=n;
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
    }

    void insertEnd(int v){      //inserting at the end
        Node n=new Node(v);

        if(head==null)
            head=n;
        else{
            Node t=head;
            while(t.next!=null)
                t=t.next;
            t.next=n;
            n.prev=t;
        }
    }

    void insertAt(int v,int pos){       //inserting at specific position
        Node n=new Node(v);

        if(head==null)
            head=n;
        else{
            Node t=head;
            for(int i=1;i<pos-1;i++)
                t=t.next;
            n.prev=t;
            n.next=t.next;
            t.next=n;
            n.next.prev=n;
        }
    }

    void deleteFirst(){         //deletes first node
        if(head==null)
            System.out.println("Linked list is empty");
        else if(head.next==null)
            head=null;
        else{
            head=head.next;
            head.prev=null;
        }
    }

    void deleteEnd(){           //deletes last node
        if(head==null)
            System.out.println("Linked list is empty");
        else if(head.next==null)
            head=null;
        else{
            Node t=head;
            while(t.next.next!=null)
                t=t.next;
            t.next.prev=null;
            t.next=null;
        }
    }

    void deleteAt(int pos){         //deleting at specified index
        if(head==null)
            System.out.println("Linked list is empty");
        else if(head.next==null)
            head=null;
        else{
            Node t=head;
            int i=0;
            while(t!=null && i<pos){
                t=t.next;
                i++;
            }
            if(t.next!=null)
                t.next.prev=t.prev;
            if(t.prev!=null)
                t.prev.next=t.next;
        }
    }

    void disp(){
        Node t=head;
        int i=0;
        System.out.println("Node\t\t\tpos\tprevious\t\tdata\t\tnext");
        System.out.println("*****************************************************************************");
        while(t!=null){
            System.out.println(t+"\t"+(i++)+"\t"+t.prev+"\t"+t.data+" \t"+t.next);
            t=t.next;
        }
       
    }

    public static void main(String[] args) {
        dll l=new dll();
        l.insertFirst(1);
        l.insertEnd(2);
        l.insertEnd(3);
        l.insertEnd(4);
        l.insertEnd(5);
        // l.insertAt(13, 2);
        // l.deleteFirst();
        // l.deleteEnd();
        l.deleteAt(1);
        l.disp();
    }
}
