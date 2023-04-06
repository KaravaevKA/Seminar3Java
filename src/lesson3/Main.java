package lesson3;

import homework.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayTest = new int[] {3,7,5,10,8,9};
        System.out.println(Arrays.toString(MergeSort.sortArray(arrayTest)));
    }
}
