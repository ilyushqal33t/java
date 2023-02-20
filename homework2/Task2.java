import java.util.logging.*;
import java.util.Arrays;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class Task2 {
    private static Logger logger = Logger.getLogger(Task2.class.getName());
    public static void main(String[] args) {
        int[] array = new int[] {3, 2, 9, 4, 1, 6, 5, 7, 8, 0};
        sortingArray(array);
    }
    private static void sortingArray(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j+1] > array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    logger.log(Level.INFO, String.format("%d <-> %d, %s",array[j+1], array[j], Arrays.toString(array)));
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
