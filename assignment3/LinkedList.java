public class LinkedList{
    Node head;
    public void insertAtBeginning(int data){
        Node node=new Node();
        node.data=data;
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    public void show(){
        Node n=head;
        while(n.next!=null){
            System.out.print(n.data+" --> ");
            n=n.next;
        }
        System.out.println(n.data+" ");
    }
    public int size(){
        Node n=head;
        int count=1;
        while(n.next!=null){
            count++;
            n=n.next;
        }
        return count;
    }
    public void insertAtEnd(int data){
        Node n=head;
        Node newnode=new Node();
        newnode.data=data;
        if(head==null){
            head=newnode;
        }
        else{
            while(n.next!=null){
                n=n.next;
            }
            n.next=newnode;
        }
    }
}
