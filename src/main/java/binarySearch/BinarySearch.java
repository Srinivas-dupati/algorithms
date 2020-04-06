package binarySearch;

public class BinarySearch {
    public int binarySearch(int[] array,int low,int high,int key) {
        int mid = (low + high) / 2;
        while (low < high) {

            if (key == array[mid])
                return array[mid];



            if (key < array[mid])
                return binarySearch(array, low, mid, key);

            if (key > array[mid])
                return binarySearch(array, mid, high, key);


        }
        return 0;
    }
}
