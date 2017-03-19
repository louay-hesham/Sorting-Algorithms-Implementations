package Lab1.Sorting;

import java.util.ArrayList;

/**
 * Created by louay on 3/19/2017.
 */
public abstract class SortingTechnique {

    protected final ArrayList<Integer> array;

    protected final SortingDirection direction;

    public SortingTechnique(ArrayList<Integer> array, SortingDirection direction) {
        this.array = array;
        this.direction = direction;
    }

    public abstract ArrayList<Integer> getSortedArray();

    protected boolean compareNumbers(int x, int y){
        if (this.direction.equals(SortingDirection.ASCENDING)) return x < y;
        else return x > y;
    }
}
