class AddTwoLinkedLists
{
    static void addTwoLinkedLists(LinkedList list1,LinkedList list2,LinkedList res)
    {
        int carry = 0;
        while(list1.head !=null || list2.head !=null)
        {   
            int sum = ((list1.head != null)?list1.head.data:0) + ((list2.head != null)?list2.head.data:0) + carry;
            carry = (sum>=10) ? 1 : 0 ;
            sum = sum % 10;
            res.insertAtEnd(sum);
            if(list1.head !=null)
            {
                list1.head = list1.head.next;
            } 
            if(list2.head != null)
            {
                list2.head = list2.head.next;
            }        
        }
        if(carry >0)
        {
            res.insertAtEnd(carry);
        }
    }
    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList res = new LinkedList();
        list1.insertAtEnd(7);
        list1.insertAtEnd(5);
        list1.insertAtEnd(9);
        list1.insertAtEnd(4);
        list1.insertAtEnd(6);

        list2.insertAtEnd(8);
        list2.insertAtEnd(4);
        list1.show();
        list2.show();
        addTwoLinkedLists(list1,list2,res);
        res.show();
    }
}