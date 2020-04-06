package quickSort;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        QuickSort quickSort=new QuickSort();
        int[] unsortedArray=new int[] {0,100,3,24,45,54};
       int[] sortrdArray= quickSort.quickSort(unsortedArray,0,unsortedArray.length-1);
       for (int i: sortrdArray){
           System.out.println("Sorted values ="+i);
       }
    }
}
