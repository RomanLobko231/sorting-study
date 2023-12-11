package Sorts;

public class SelectionSort {
    public static int[] selectionSort(int[] inputArray){
        for (int i = 0; i < inputArray.length - 1; i++) {

            int min_idx = i;
            for (int j = i+1; j < inputArray.length; j++){
                if (inputArray[j] < inputArray[min_idx]){
                    min_idx = j;
                }

            }
            swap(inputArray, i, min_idx);
        }
        return inputArray;
    }

    private static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
