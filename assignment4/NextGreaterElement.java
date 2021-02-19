import java.util.*;
class NGE{
    static void findNextGreaterEle(int[] arr){
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            while(!s.isEmpty() && s.peek()<arr[i]){
                System.out.println(s.peek()+" has next geater element "+arr[i]);
                s.pop();
            }
            s.push(arr[i]);
        }
        while(!s.isEmpty()){
            System.out.println(s.peek()+" has next geater element -1 ");
            s.pop();
        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,2,25};
        findNextGreaterEle(arr);
    }
}