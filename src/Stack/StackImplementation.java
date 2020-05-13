package Stack;

import java.util.EmptyStackException;

public class StackImplementation<Integer> {
    static class Stack<Integer>{
        private Integer data;
        private Stack<Integer> next;
        public Stack(Integer d){
            this.data = d;
        }
    }
    private Stack<Integer> top;

    public Integer pop(){
        if(top == null) throw new EmptyStackException();
        Integer popItem = top.data;
        top = top.next;
        return popItem;
    }

    public void push(Integer node){
        Stack<Integer> stack = new Stack<Integer>(node);
        stack.next = top;
        top = stack;
    }

    public Integer peek(){
        if(top == null) throw new EmptyStackException();
        else{
            return top.data;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

//    public void sortStack(Stack<Integer> top){
//        Stack<Integer> second = new Stack<Integer>(top.data);
//        while (top != null){
//            int tmp = top.pop();
//            while( !second.isEmpty() && second.peek() > tmp){
//                top.push(second.pop());
//            }
//            second.push(tmp);
//        }
//        while(!r.isEmpty()){
//            top.push(second.pop());
//        }
//    }
}
