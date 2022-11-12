package aula10;

import java.util.Arrays;

public class ParallelArraySortingExemplo {

    public static void main(String[] args) {

        int[] array = {5, 8, 1, 0, 6, 9, 50, -3};

        for(int a : array) {
            System.out.print(a + " ");
        }

        Arrays.parallelSort(array);
        System.out.println();

        for(int a : array) {
            System.out.print(a + " ");
        }
    }
}
