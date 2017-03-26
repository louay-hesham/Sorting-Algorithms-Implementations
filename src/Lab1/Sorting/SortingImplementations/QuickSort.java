package Lab1.Sorting.SortingImplementations;
import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Muhammad Korra on 20-Mar-17.
 */
public class QuickSort extends SortingTechnique {


    public QuickSort(int[] array, SortingDirection direction) {
        super(array, direction);
    }



    @Override
    protected void sort() {
        quickSort(this.array,0,this.array.length - 1);
    }

    @Override
    public String toString() {
        return "Quick Sort";
    }

    public static int partition (int [] array, int left, int pivot){
        int x, i;
        x = array[pivot];
        i = left - 1;
        for (int j = left; j <= pivot - 1; j++){
            if (array[j] <= x){
                i++;
                swap(array,i ,j);
            }

        }

        swap(array, i+1, pivot);
        return (i+1);
    }
    public static void quickSort (int [] array, int left, int pivot){
        if (left < pivot){
            int q = partition(array,left,pivot);
            quickSort(array, left, q - 1);
            quickSort(array, q+1,pivot);
        }
    }

    public static void swap (int [] array, int source, int destination){
        int temp;
        temp = array[destination];
        array[destination] = array[source];
        array[source] = temp;
    }
}



