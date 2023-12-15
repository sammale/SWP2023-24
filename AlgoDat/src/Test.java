public class Test {
    public static void main(String[] args) {
        int[] arrayBubbleSort = {64, 34, 700, 12, 22, 11, 90};
        int[] arraySelectionSort = {64, 34, 700, 12, 22, 11, 90};

        // Use the BubbleSort class
        Sortable bubbleSortable = new BubbleSort();
        bubbleSortable.sort(arrayBubbleSort);

        // Print the sorted array for Bubble Sort
        System.out.println("Sorted array using Bubble Sort:");
        for (int num : arrayBubbleSort) {
            System.out.print(num + " ");
        }

        // Use the SelectionSort class
        Sortable selectionSortable = new SelectionSort();
        selectionSortable.sort(arraySelectionSort);

        // Print the sorted array for Selection Sort
        System.out.println("\nSorted array using Selection Sort:");
        for (int num : arraySelectionSort) {
            System.out.print(num + " ");
        }
    }
}
