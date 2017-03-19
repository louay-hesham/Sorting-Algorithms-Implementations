package Lab1.Sorting.SortingImplementations;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingTechnique;

import java.util.ArrayList;

/**
 * Created by louay on 3/19/2017.
 */
public class HeapSort extends SortingTechnique {

    public HeapSort(ArrayList<Integer> array, SortingDirection direction){
        super(array, direction);
    }

    @Override
    public ArrayList<Integer> getSortedArray() {

        return this.array;
    }

    private int left(int i){
        return 2*i + 1;
    }

    private int right (int i){
        return 2*i + 2;
    }

    private int parent (int i){
        return i/2 - 1;
    }

    private void heapify(){

    }

    private void buildHeap(){

    }

    private void sort(){
        
    }
}
