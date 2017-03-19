package Lab1;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingImplementations.HeapSort;
import Lab1.Sorting.SortingTechnique;

public class Main {

    public static void main(String[] args) {
        int[] A = {5, 3, 6, 2, 1, 99, 50, 20, 56, 8, 0, -1, -65, 2, 555};
        SortingTechnique heapSort = new HeapSort(A, SortingDirection.DESCENDING);
        printArray(A);
        printArray(heapSort.getSortedArray());
    }

    private static void printArray(int[] A){
        System.out.print("{ ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + ((i != A.length - 1)? ", ":" "));
        }
        System.out.println("}");
    }
}
