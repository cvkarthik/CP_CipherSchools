class RemoveDuplicates{
    static void removeDuplicates(LinkedList list){//in sorted LL
        Node curr=list.head;
        while(curr!=null){
            Node tmp=curr;
            while(tmp!=null && tmp.data==curr.data)
                tmp=tmp.next;
            curr.next=tmp;
            curr=curr.next;
        }
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
        removeDuplicates(list);
        list.show();
    }
}