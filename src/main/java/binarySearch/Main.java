package binarySearch;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();
        int[] sortedArray=new int[] {1,2,3,6,7,8};
      int result=  binarySearch.binarySearch(sortedArray,0,sortedArray.length-1,0);
        System.out.println("result= "+result);

    }
}
