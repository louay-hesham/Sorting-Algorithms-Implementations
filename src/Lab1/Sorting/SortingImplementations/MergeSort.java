package Lab1.Sorting.SortingImplementations;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

/**
 * Created by zeyadzanaty on 3/24/17.
 */
public class MergeSort extends SortingTechnique {

    private int[] copyArray;
    private int len = array.length;

    public MergeSort(int[] array, SortingDirection direction) {
        super(array, direction);
    }

    public void merge(int low, int high, int middle) {
        for (int i = low; i <= high; i++) {
            copyArray[i] = array[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (this.compareNumbers(copyArray[i], copyArray[j])) {
                array[k] = copyArray[i];
                i++;
            } else {
                array[k] = copyArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = copyArray[i];
            k++;
            i++;
        }
    }

    public void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, high, middle);
        }
    }

    @Override
    protected void sort() {
        this.copyArray = new int[array.length];
        mergeSort(0, array.length - 1);
    }

    @Override
    public String toString() {
        return "Merge Sort\t\t\t\t\t";
    }
}
