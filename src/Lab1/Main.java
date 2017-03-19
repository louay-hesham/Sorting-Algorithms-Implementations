package Lab1;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingImplementations.HeapSort;
import Lab1.Sorting.SortingTechnique;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static final int rangeMin = 0, rangeMax = 1000000;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        SortingDirection direction = SortingDirection.DESCENDING;
        int t = 1;
        for (int n = 100000; n <= 1000000; n += 100000) {
            sb.append("Test case " + t + ": n = " + n + "\n");
            t++;

            int[] A = generateNumbers(n);

            SortingTechnique heapSort = new HeapSort(A, direction);
            if (isSorted(heapSort.getSortedArray(), direction)) {
                sb.append("Heap Sort:\tSuccess" + "\n");
            } else {
                sb.append("Heap Sort:\tFailure" + "\n");
            }

            sb.append("\n");
        }

        saveFile(sb.toString());
    }

    private static int[] generateNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(rangeMin, rangeMax + 1);
        }
        return numbers;
    }

    private static boolean isSorted(int[] A, SortingDirection direction) {
        for (int i = 0; i < A.length - 1; i++) {
            if (!compareNumbers(A[i], A[i + 1], direction)) {
                return false;
            }
        }
        return true;
    }

    private static boolean compareNumbers(int x, int y, SortingDirection direction) {
        if (direction == SortingDirection.ASCENDING) return x <= y;
        else return x >= y;
    }

    public static void saveFile(String str) {

        File file = new File("Test results.txt");
        try {
            PrintWriter writer = new PrintWriter(file.getPath() + ".txt");
            writer.write(str);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void printArray(int[] A) {
        System.out.print("{ ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ((i != A.length - 1) ? ", " : " "));
        }
        System.out.println("}");
    }
}
