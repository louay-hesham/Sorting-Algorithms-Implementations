package Lab1.Sorting.SortingImplementations;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

/**
 * Created by Muhammad Korra on 20-Mar-17.
 */
public class QuickSort extends SortingTechnique {


    public QuickSort(int[] array, SortingDirection direction) {
        super(array, direction);
    }


    @Override
    protected void sort() {
        int pivot = this.array.length - 1;
        quickSort(0, pivot);
    }

    @Override
    public String toString() {
        return "Quick Sort";
    }

    private int partition(int left, int pivot) {
        int x, i;
        x = array[pivot];
        i = left - 1;
        for (int j = left; j <= pivot - 1; j++) {
            if (this.compareNumbers(array[j], x)) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, pivot);
        return (i + 1);
    }

    private void quickSort(int left, int pivot) {
        if (left <= pivot) {
            int q = partition(left, pivot);
            quickSort(left, q - 1);
            quickSort(q + 1, pivot);
        }
    }

    private void swap(int source, int destination) {
        int temp;
        temp = array[destination];
        array[destination] = array[source];
        array[source] = temp;
    }
}



