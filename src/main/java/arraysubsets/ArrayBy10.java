package arraysubsets;

/**
 * The type Array by 10.
 */
public class ArrayBy10 {

    /**
     * The Array.
     */
    int[] array=null;

    /**
     * Print array.
     */
    public void printArray(){
        array=new int[] {1,2,3,4,5,6,7,8,9,10};
        int k=0;
        for(int i=0;i<array.length-1;i++){
             k= i+2;

            System.out.println("["+ array[i] +"  "+ array[i+1] +"]");
          /*  int[] arr=Arrays.copyOfRange(array,i,k);*/
             i++;


        }

    }
}
