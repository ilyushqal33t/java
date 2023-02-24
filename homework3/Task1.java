import java.util.Arrays;

/*
 * Реализовать алгоритм сортировки слиянием.
 */


public class Task1 {
    public static void main(String[] args) {
        int[] array = { 12, 6, 4, 1, 15, 10, 2, 8};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
    }

    private static void merge(int[] arr1, int arr1Start, int[] arr2, int arr2Start, int[] dest, int destStart,
            int size) {
        int index1 = arr1Start;
        int index2 = arr2Start;

        int arr1End = Math.min(arr1Start + size, arr1.length);
        int arr2End = Math.min(arr2Start + size, arr2.length);

        int iterCount = arr1End - arr1Start + arr2End - arr2Start;

        for (int i = destStart; i < destStart + iterCount; i++) {
            if (index1 < arr1End && (index2 >= arr2End || arr1[index1] < arr2[index2])) {
                dest[i] = arr1[index1];
                index1++;
            } else {
                dest[i] = arr2[index2];
                index2++;
            }
        }
    }

    private static void mergeSort(int[] array) {
        int[] temp;
        int[] currentArr = array;
        int[] currentDest = new int[array.length];

        int size = 1;

        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentArr, i, currentArr, i + size, currentDest, i, size);
            }
            temp = currentArr;
            currentArr = currentDest;
            currentDest = temp;

            size = size * 2;

            System.out.println(Arrays.toString(currentArr));
        }
    }
}