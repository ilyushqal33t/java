import java.util.Arrays;
import java.util.OptionalDouble;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка
 */

public class Task3 {
    public static void main(String[] args) {
        int[] array = {2,2,3,4,5,6,7};
        findMinMax(array);
        findAvefage(array);
    }

    private static void findMinMax(int[] array) {
        double min = array[0];
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }
        System.out.printf("min = %.1f\n", min);
        System.out.printf("max = %.1f\n", max);
    }

    private static void findAvefage(int[] array) {
        OptionalDouble average = Arrays.stream(array).average();
        System.out.printf("average = %.3f", average.getAsDouble());
    }
}
