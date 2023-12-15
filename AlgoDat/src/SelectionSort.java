// SelectionSort.java
public class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    // Update minIndex if a smaller element is found
                    minIndex = j;
                }
            }

            // Swap elements if a smaller element is found
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
