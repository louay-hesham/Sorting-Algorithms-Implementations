package Lab1.Sorting.SortingImplementations;
import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Muhammad Korra on 20-Mar-17.
 */
public class QuickSort extends SortingTechnique {

    private int arraySize;

    public QuickSort(int[] array, SortingDirection direction) {
        super(array, direction);
        this.arraySize = array.length;
    }

    public int partition (int [] arr, int left, int right){
        int pivot = arr[ThreadLocalRandom.current().nextInt(left, right+1)];

            while (left <= right){
                while (array[left] < pivot) left++;
                while (array[right] > pivot) right++;
                if (left <= right){
                    swap(arr,left,right);
                    left++;
                    right--;
                }
            }

            return left;
    }

    private static void swap (int [] array, int firstIndex, int secondIndex){
        int temp;
        temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    @Override
    protected void sort() {

    }

    @Override
    public String toString() {
        return null;
    }
}
