package app.sortingAlgo;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 6, 3, 9};
        
        System.out.println("Array before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        insertionSort(array);
        
        System.out.println("\nArray after sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}