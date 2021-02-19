import java.util.*;
class ReverseStack{
    static Stack<Character> s = new Stack<Character>();
    static void insertAtBottom(char a){
        if(s.isEmpty()){
            s.push(a);
        }
        else{
            char x=s.peek();
            s.pop();
            insertAtBottom(a);
            s.push(x);
        }
    }
    static void reverse(){
        if(s.size()>0){
            char a=s.peek();
            s.pop();
            reverse();
            insertAtBottom(a);
        }
    }
    public static void main(String[] args) {
        s.push('a');
        s.push('b');
        s.push('c');
        System.out.println(s);
        reverse();
        System.out.println("After reversing ");
        System.out.println(s);
    }
}