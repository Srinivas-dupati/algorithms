package bubbleSort;

/**
 * The type Bubble sort.
 */
public class BubbleSort {

    /**
     * Bubble sort int [ ].
     *
     * @param array the array
     * @return the int [ ]
     */
    public int[] bubbleSort(int[] array){
        int temp=0;
        /*int lenght=array.length-1;*/
//{0,100,3,24}
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]  > array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }

            }

        }
        return array;
    }

    private void swap(int[] array, int k, int l) {
        int temp=array[k];
        array[k]=array[l];
        array[l]=temp;


    }
}
