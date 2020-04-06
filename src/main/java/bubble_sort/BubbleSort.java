package bubble_sort;

public class BubbleSort {
    public int[] bubbleSort(int[] arr){

        int length= arr.length-1;

        for(int i=0 ;i<length;i++){
            for (int j=i+1;j<length;j++){
                if(arr[i]> arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;

                }
            }
        }
        return arr;

    }
}
