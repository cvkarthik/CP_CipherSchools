class ReverseLL{
    static void reverseLinkedList(LinkedList list){
        Node prev=null;
        Node curr=list.head;
        Node next=null;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        list.head=prev;
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.show();
        reverseLinkedList(list);
        list.show();
    }
}