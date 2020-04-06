package selectionSort;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort=new SelectionSort();
        int[] arr=new int[]{3,5,2,0};
        int[] sort=selectionSort.selectionSort(arr);
        for (int i: sort){
            System.out.println("Sorted value ="+i);
        }
    }
}
