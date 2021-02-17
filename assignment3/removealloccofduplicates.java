class Duplicates{
    static void removeAllDuplicates(LinkedList list){//in sorted LL
        Node dummy=new Node();
        Node prev=dummy;
        dummy.next=list.head;
        Node curr=list.head;
        while(curr!=null){
            while(curr.next!=null && prev.next.data==curr.next.data)
                curr=curr.next;
            if(prev.next==curr){
                prev=prev.next;
            }
            else{
                prev.next=curr.next;
            }
            curr=curr.next;
        }
        list.head=dummy.next;

    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(6);
        removeAllDuplicates(list);
        list.show();
    }
}