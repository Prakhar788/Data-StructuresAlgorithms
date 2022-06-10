//Implementing Doubly Ended Queue using generic class
import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementDequeue {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(20);
        deque.addFirst(10);
        deque.addLast(30);
        deque.addLast(40);
        deque.add(50);
        System.out.println(deque.size());
        System.out.println(deque.poll());
        System.out.println(deque.remove());
        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
    }
}