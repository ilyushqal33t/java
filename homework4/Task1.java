import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(reverseList(list));
    }

    private static LinkedList reverseList(LinkedList<Integer> list) {
        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size() / 2; i++) {
                int temp = list.get(i);
                list.set(i, list.get(list.size() - 1 - i));
                list.set((list.size() - 1 - i), temp);
            }
        }
        else{
            for (int i = 0; i < list.size() / 2 + 1; i++) {
                int temp = list.get(i);
                list.set(i, list.get(list.size() - 1 - i));
                list.set((list.size() - 1 - i), temp);
            }
        }
        return list;
    }
}