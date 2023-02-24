import java.util.ArrayList;
import java.util.Arrays;

/*
 * Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */

public class Task2 {
    public static void main(String[] args) {
        String[] array = {"2", "3", "4", "5", "6"};
        removeEven(array);
    }

    private static void removeEven(String[] array) {
        ArrayList<String> res = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < res.size(); i++) {
            if(Integer.parseInt(res.get(i))%2 == 0){
                res.remove(i);
                i--;
            }
        }
        System.out.println(res.toString());
    }
}
