package arrayRotation;

public class ArrayRotation {
    //1234
    //2341
    //3412
    //4123

    public int[] arrayRotate(int[] array, int time) {
        int[] a = null;
        for (int i = 1; i <= time; i++) {
            a = rotateArray(array);
        }
        return a;
    }

    private int[] rotateArray(int[] array) {
        for (int j = 0; j < array.length-1; j++) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;

        }
        return array;


    }
}
