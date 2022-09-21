import java.util.*;
public class Deque1 {
    //operations in deque
    public static void main(String[] args) {
        Deque <Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First element = "+ deque.getFirst());
        System.out.println("Last element = "+ deque.getLast());
    }
}
