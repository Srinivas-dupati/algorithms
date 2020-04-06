package selectionSort;

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        int rear = array.length;
        int mid = 0;
        //3,5,2,0
        for (int i = 0; i < array.length-1; i++) {
            int minvalue=i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j]< array[minvalue]) {
                    minvalue=j;


                }
                int temp = array[minvalue];
                array[minvalue] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
