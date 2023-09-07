package Learn08;


public class BubbleSort {

    public interface BubbleSortNumber {
        void bubbleSort(int[] array);
    }

    public static void main(String[] args) {
        int[] array = new int[]{25, 24, 12, 76, 101, 96, 28};
        BubbleSortNumber bubbleSortNumber = BubbleSort::bubbleSort;
        bubbleSortNumber.bubbleSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
