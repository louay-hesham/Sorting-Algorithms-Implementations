package Lab1;

import Lab1.Sorting.SortingDirection;
import Lab1.Sorting.SortingImplementations.*;
import Lab1.Sorting.SortingTechnique;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static final int rangeMin = 0, rangeMax = 1000000;
    private static SortingDirection direction = SortingDirection.ASCENDING;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int t = 1;
        for (int n = 10; n <= 100000; n *= 10) {
            System.out.println("Testing with n = " + n);
            sb.append("Test case " + t + ": n = " + n + "\n");
            t++;

            int[] A = generateNumbers(n);

            SortingTechnique heapSort = new HeapSort(A, direction);
            testAlgorithm(heapSort, sb);

            SortingTechnique quickSort = new QuickSort(A, direction);
            testAlgorithm(quickSort, sb);

            SortingTechnique mergeSort = new MergeSort(A, direction);
            testAlgorithm(mergeSort, sb);

            SortingTechnique bubbleSort = new BubbleSort(A, direction);
            testAlgorithm(bubbleSort, sb);

            SortingTechnique insertionSort = new InsertionSort(A, direction);
            testAlgorithm(insertionSort, sb);

            sb.append("\n");
        }

        saveFile(sb.toString());
    }

    private static void testAlgorithm(SortingTechnique technique, StringBuilder sb) {
        long start = System.nanoTime();
        int[] sorted = technique.getSortedArray();
        long end = System.nanoTime();
        if (isSorted(sorted)) {
            sb.append(technique.toString() + ":\t\tSuccess" + "\t\tTime elapsed = " + (end - start) + "\tnano seconds\n");
        } else {
            sb.append(technique.toString() + ":\t\tFailure" + "\n");
        }
    }

    private static int[] generateNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(rangeMin, rangeMax + 1);
        }
        return numbers;
    }

    private static boolean isSorted(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (!compareNumbers(A[i], A[i + 1])) {
                return false;
            }
        }
        return true;
    }

    private static boolean compareNumbers(int x, int y) {
        if (direction == SortingDirection.ASCENDING) return x <= y;
        else return x >= y;
    }

    public static void saveFile(String str) {

        File file = new File("Test results.txt");
        try {
            PrintWriter writer = new PrintWriter(file.getPath());
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
