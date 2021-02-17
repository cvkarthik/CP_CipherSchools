class DeleteNode{
    static int deleteNodeInLL(LinkedList list,int num ){
        Node prev=null;
        Node curr=list.head;
        while(curr.data!=num && curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        if(curr.data==num){
            prev.next=curr.next;
            int deleteddata=curr.data;
            curr.next=null;
            return deleteddata;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.show();
        int result=deleteNodeInLL(list,3);
        if(result==-1)
            System.out.println("Element not found");
        else
            System.out.println("Deleted "+result);
        list.show();
    }
}