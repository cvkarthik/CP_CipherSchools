class Merge2SortedLL{
    static Node merge2SortedLL(LinkedList list1, LinkedList list2){
        Node dummy=new Node();
        Node tail=dummy;
        while(true){
            if(list1.head==null){
                tail.next=list2.head;
                break;
            }
            if(list2.head==null){
                tail.next=list1.head;
                break;
            }
            if(list1.head.data<=list2.head.data){
                tail.next=list1.head;
                list1.head=list1.head.next;
            }
            else{
                tail.next=list2.head;
                list2.head=list2.head.next;
            }
            tail=tail.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insertAtEnd(3);
        l1.insertAtEnd(5);
        l1.insertAtEnd(8);
        LinkedList l2=new LinkedList();
        l2.insertAtEnd(1);
        l2.insertAtEnd(4);
        l2.insertAtEnd(9);
        l1.head=merge2SortedLL(l1,l2);
        l1.show();
        
    }
}