package Lab1.Sorting.SortingImplementations;

import Lab1.Sorting.SortingDirection;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by louay on 3/27/2017.
 */
public class QuickSortRandomPivot extends QuickSortFixedPivot {

    public QuickSortRandomPivot(int[] array, SortingDirection direction) {
        super(array, direction);
    }

    @Override
    public String toString() {
        return "Quick Sort (Random Pivot)\t";
    }

    protected int partition(int l, int pivot){
        int i = ThreadLocalRandom.current().nextInt(l, pivot + 1);
        this.swap(pivot, i);
        return super.partition(l, pivot);
    }
}
