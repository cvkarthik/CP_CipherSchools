class Intersection2LL{
    static Node intersectionof2LL(LinkedList l1,LinkedList l2){
        Node dummy=new Node();
        Node n1=l1.head;
        Node n2=l2.head;
        Node head=dummy;
        if(n1==null)
            return n2;
        if(n2==null)
            return n1;
        while(n1!=null && n2!=null){
            if(n1.data==n2.data){
                head.next=new Node();
                head=head.next;
                head.data=n1.data;
                n1=n1.next;
                n2=n2.next;
            }
            else if (n1.data < n2.data)
                n1=n1.next;
            else
                n2=n2.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insertAtEnd(1);
        l1.insertAtEnd(3);
        l1.insertAtEnd(5);
        l1.insertAtEnd(7);
        LinkedList l2=new LinkedList();
        l2.insertAtEnd(3);
        l2.insertAtEnd(7);
        l2.insertAtEnd(9);
        Node head=intersectionof2LL(l1,l2);
        Node tmp=head;
        if(tmp==null)
            System.out.print("No elements found");
        else
        {
            while(tmp.next!=null){
                System.out.print(tmp.data+" --> ");
                tmp=tmp.next;
            }
            System.out.print(tmp.data);
        }
    }
}