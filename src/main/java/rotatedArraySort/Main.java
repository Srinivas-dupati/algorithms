package rotatedArraySort;

public class Main {

    public static void main(String[] args) {
        RotatedArraySort rotatedArraySort=new RotatedArraySort();
        int[] arr1=new int[] {3,2,1,5};
        int[] arr2=new int[] {10,9,8};

        int result=rotatedArraySort.roatateArraySort(arr1,arr2);
        System.out.println("Final result after ="+result);
    }
}
