package main;

import java.util.Scanner;
import Sorts.*;

public class Main {
    static int[] inputArray = resetArray(1, 100);


    public static void main(String[] args) {
        System.out.println("Unsorted array: ");
        printAnArray(inputArray);
        System.out.println("Sorted arrays: ");
        int[] sortedSimpleArray = SimpleSort.simpleSort(inputArray);
        printAnArray(sortedSimpleArray);
        int[] sortedSelectionArray = SelectionSort.selectionSort(inputArray);
        printAnArray(sortedSelectionArray);
        int[] sortedBubbleArray = BubbleSort.bubbleSort(inputArray);
        printAnArray(sortedBubbleArray);
    }

    public static int[] resetArray(int min, int max){
        System.out.println("Enter the size of the array: ");

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return array;
    }
    public static void printAnArray(int[] array){
        for (int num:array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}