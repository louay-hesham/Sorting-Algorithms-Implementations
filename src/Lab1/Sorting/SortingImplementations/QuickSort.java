package Lab1.Sorting.SortingImplementations;
import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

/**
 * Created by Muhammad Korra on 20-Mar-17.
 */
public class QuickSort extends SortingTechnique {

    private int arraySize;

    public QuickSort(int[] array, SortingDirection direction) {
        super(array, direction);
        this.arraySize = array.length;
    }

    @Override
    protected void sort() {

    }

    @Override
    public String toString() {
        return null;
    }
}
