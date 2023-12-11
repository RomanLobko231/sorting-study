package Sorts;

public class BubbleSort {
    public static int[] bubbleSort(int[] inputArray){
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]){
                    swap(inputArray, j, j + 1);
                }
            }
        }
        return inputArray;
    }

    private static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
