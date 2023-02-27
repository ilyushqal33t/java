import java.util.LinkedList;

public class Task2 {
    private static LinkedList<Integer> list = new LinkedList<>();
    public static void main(String[] args) {
        
        enqueue(1);
        enqueue(2);
        enqueue(3);

        System.out.println(first());

        System.out.println(list);

        System.out.println(dequeue());
        
        System.out.println(list);

    }
    public static void enqueue(int val) {
        list.addLast(val);
    }
    public static int dequeue() {
        return list.removeFirst();
    }
    public static int first() {
        return list.getFirst();
    }
}
