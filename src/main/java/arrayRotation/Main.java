package arrayRotation;

public class Main {
    public static void main(String[] args) {
        ArrayRotation arrayRotation=new ArrayRotation();
        int[] array=new int[]{1,2,3,4,5,6,7,8,9};
        int[] result=arrayRotation.arrayRotate(array,4);
        for (int a:result){
            System.out.println(a);
        }
    }
}
