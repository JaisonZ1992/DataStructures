package search;

public class SearchAlgorithm {


    public static void performLinearSearch(int[] array, int item) {
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item)
                position = i;
        }
        printResult(item, position + 1);
    }

    public static void performBinarySearch(int[] array, int item) {
        int beginning = 0;
        int end = array.length - 1;
        int mid;
        while (beginning <= end) {
            mid = (beginning + end) / 2;
            if (item == array[mid]) {
                printResult(item, mid + 1);
                break;
            } else if (item < array[mid]) {
                end = mid - 1;
            } else {
                beginning = mid + 1;
            }
        }
    }

    private static void printResult(int item, int position) {
        if (position > -1)
            System.out.println("Item " + item + " found at position: " + position);
        else
            System.out.println("Item " + item + " not found");
    }
}
