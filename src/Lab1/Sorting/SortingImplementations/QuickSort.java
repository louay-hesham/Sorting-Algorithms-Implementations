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

    @Override
    protected void sort() {
        this.quickSort(this.array,0, this.array.length - 1);


    }

    @Override
    public String toString() {
        return "Quick Sort";
    }

    public int partition (int left, int right){
        int pivot = array[ThreadLocalRandom.current().nextInt(left, right+1)];

            while (left <= right){
                while (this.array[left] < pivot) left++;
                while (this.array[right] > pivot) right++;
                if (left <= right){
                    swap(this.array,left,right);
                    left++;
                    right--;
                }
            }

            return left;
    }

    public void quickSort(int [] array, int left, int right){
        if (left >= right) {
            return;
        }

        int index = partition(left,right);
        quickSort(array,left,index -1);
        quickSort(array,index,right);

    }

    private static void swap (int [] array, int firstIndex, int secondIndex){
        int temp;
        temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }


}



