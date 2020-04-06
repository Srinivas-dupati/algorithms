package bubble_sort;

public class Main {
    public static void main(String[] args) {
        BubbleSort  bubbleSort=new BubbleSort();
        int[] unsortedArray= new int[] {3,2,7,1,0,10};
        int[] sortedArray=bubbleSort.bubbleSort(unsortedArray);
        for (int i = 0; i<sortedArray.length ; i++) {
            System.out.println("Value: "+sortedArray[i]);

        }
    }
}
