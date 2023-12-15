// Main.java
public class Test {
    public static void main(String[] args) {
        int[] array = {64, 34, 700, 12, 22, 11, 90};

        // Use the BubbleSort class
        Sortable sortable = new BubbleSort();
        sortable.sort(array);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
