package Lab1.Sorting;

/**
 * Created by louay on 3/19/2017.
 */
public abstract class SortingTechnique {

    protected final int[] array;

    protected final SortingDirection direction;

    public SortingTechnique(int[] array, SortingDirection direction) {
        this.array = array.clone();
        this.direction = direction;
    }

    protected abstract void sort();

    protected boolean compareNumbers(int x, int y) {
        if (this.direction.equals(SortingDirection.ASCENDING)) return x <= y;
        else return x >= y;
    }

    protected void swap(int source, int destination){
        int temp;
        temp = array[destination];
        array[destination] = array[source];
        array[source] = temp;
    }

    public int[] getSortedArray() {
        this.sort();
        return this.array;
    }

    public abstract String toString();
}
