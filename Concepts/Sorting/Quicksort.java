package JavaLearning.Concepts.Sorting;

import java.util.Random;

public class Quicksort<T extends Comparable<T>> {
    private Random rand = new Random();

    public void quicksort(T[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private void quicksort(T[] array, int lowIndex, int highIndex) {

    }

    public static void main(String[] args) {
        System.out.println("Creating quicksort algo.");
    }
}
