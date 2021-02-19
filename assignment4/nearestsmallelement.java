import java.util.*;
class NSE{
    static void nearestSmallerElement(int[] arr){
        int[] arr1=new int[arr.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(s.isEmpty()){
                s.push(arr[i]);
                continue;
            }
            while(!s.isEmpty() && arr[i]<s.peek()){
                //arr1[i]=arr[i];
                System.out.println(s.peek() +" has "+arr[i]);
                s.pop();
            }
            s.push(arr[i]);
        }
        while(!s.isEmpty()){
            System.out.println(s.peek() +" has _ ");
            s.pop();
        }
    }
    public static void main(String[] args) {
        int[] arr={1, 3, 0, 2, 5};
        nearestSmallerElement(arr);
    }
}