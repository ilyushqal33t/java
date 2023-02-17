import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 2, 2, 3, 2, 3, 3, 2, 3, 3, 2 };
        int val = 3;
        int length = array.length - 1;
        for (int i = 0; i < length; i++) {
            if (array[i] == val) {
                while (array[length] == val && length > i) {
                    length--;
                }
                int temp = array[i];
                array[i] = array[length];
                array[length] = temp;
                length--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
