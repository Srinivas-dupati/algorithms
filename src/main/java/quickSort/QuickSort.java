package quickSort;

/**
 * The type Quick sort.
 */
public class QuickSort {
    /**
     * Quick sort int [ ].
     *
     * @param array the array
     * @param low   the low
     * @param high  the high
     * @return the int [ ]
     */
    public int[] quickSort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        int mid = (low + high) / 2;
        int pivotal = array[mid];
        while (i < j) {
            while(array[i] < pivotal) {
                i++;
            }
            while (array[j] > pivotal) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;


            }
          // 1st part array from low to J
            if (low < j) {
                quickSort(array, low, j);
            }
            // 2nd part array from i to high
            if (high > i) {
                quickSort(array, i, high);

            }
        }
        return array;
    }
}
