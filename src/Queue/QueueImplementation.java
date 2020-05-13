package Queue;

import java.util.NoSuchElementException;

public class QueueImplementation<Integer> {
    static class Queue<Integer>{
        private Integer data;
        private Queue<Integer> next;
        public Queue(Integer d){
            this.data = d;
        }
    }
    Queue<Integer> first;
    Queue<Integer> last;

    public void add(Integer node){
        Queue<Integer> queue = new Queue<Integer>(node);
        if(last == null){
            last = queue;
        }
        if(first == null){
            first = last;
        }
        last.next = queue;
    }

    public Integer remove(){
        if(first == null) throw new NoSuchElementException();
        Integer removeItem = first.data;
        first = first.next;
        if(first == null){
            first = last;
        }
        return removeItem;
    }

    public Integer peek(){
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}
