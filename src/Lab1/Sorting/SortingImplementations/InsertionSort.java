package Lab1.Sorting.SortingImplementations;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

/**
 * Created by Muhammad Korra on 27-Mar-17.
 */
public class InsertionSort extends SortingTechnique {
    public InsertionSort(int[] array, SortingDirection direction) {
        super(array, direction);
    }

    @Override
    protected void sort() {
        insertionSort();
    }

    @Override
    public String toString() {
        return "Insertion Sort\t\t\t\t";
    }

    public void insertionSort() {

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (this.compareNumbers(array[j], array[j - 1])) {
                    this.swap(j, j - 1);
                }
            }
        }
    }
}
