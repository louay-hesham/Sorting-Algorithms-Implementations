package Lab1.Sorting.SortingImplementations;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

/**
 * Created by zeyadzanaty on 3/22/17.
 */
public class BubbleSort extends SortingTechnique {

    public BubbleSort(int[] array, SortingDirection direction) {
        super(array, direction);
    }

    public String toString() {
        return "Bubble\tSort";
    }

    protected void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (this.compareNumbers(array[j], array[j - 1])) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
