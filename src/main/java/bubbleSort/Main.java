package bubbleSort;

/**
 * The type Main.
 */
public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int[] unsortedArray=new int[] {0,100,3,24};
        int[] sortedArray=bubbleSort.bubbleSort(unsortedArray);
        for (int i: sortedArray){
            System.out.println("Sorted values= "+i);
        }
    }
}
