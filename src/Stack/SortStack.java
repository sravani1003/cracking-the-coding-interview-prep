package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SortStack {
    static class Stack<Integer>{
        private Integer data;
        private Stack<Integer> next;
        public Stack(Integer d){
            this.data = d;
        }
    }

    private static Stack<Integer> top;

    public static Integer pop(){
        if(top == null) throw new EmptyStackException();
        Integer popItem = top.data;
        top = top.next;
        return popItem;
    }

//    public static void sortStack(Stack<Integer> top){
//        Stack<Integer> second = new Stack<Integer>();
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
