package Lab1.Sorting.SortingImplementations;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

/**
 * Created by louay on 3/19/2017.
 */
public class HeapSort extends SortingTechnique {

    int heapSize;

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
        int largest;
        if (l <= this.heapSize && this.compareNumbers(array[l], array[i])) {
            largest = l;
        } else {
            largest = i;
        }

        if (r <= this.heapSize && this.compareNumbers(array[r], array[largest])) {
            largest = r;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(largest);
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
        for (int i = array.length; i >= 2; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            this.heapSize--;
            this.heapify(0);
        }
    }

    public HeapSort(int[] array, SortingDirection direction) {
        super(array, direction);
        this.heapSize = array.length;
    }
}
