package Lab1.Sorting.SortingImplementations;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

/**
 * Created by louay on 3/19/2017.
 */
public class HeapSort extends SortingTechnique {

    int heapSize;

    public HeapSort(int[] array, SortingDirection direction) {
        super(array, direction);
        this.heapSize = array.length;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private void heapify(int i) {
        int l = this.left(i);
        int r = this.right(i);
        int target;
        if (l < this.heapSize && this.compareNumbers(array[i], array[l])) {
            target = l;
        } else {
            target = i;
        }

        if (r < this.heapSize && this.compareNumbers(array[target], array[r])) {
            target = r;
        }

        if (target != i) {
            this.swap(i, target);
            heapify(target);
        }
    }

    private void buildHeap() {
        for (int i = array.length / 2; i >= 0; i--) {
            this.heapify(i);
        }
    }

    @Override
    protected void sort() {
        this.buildHeap();
        for (int i = array.length - 1; i >= 1; i--) {
            this.swap(0, i);
            this.heapSize--;
            this.heapify(0);
        }
    }

    @Override
    public String toString() {
        return "Heap Sort\t\t";
    }
}
