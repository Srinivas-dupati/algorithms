package comparethetriplets;

public class Main {
    public static void main(String[] args) {
        CompareTriplets compareTriplets=new CompareTriplets();
        int[] arra1=new int[] {1,2,3,4};
        int[] arra2=new int[] {0,2,3,-4};
      int[] result=  compareTriplets.comapreTriplets(arra1,arra2);
        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i]);

        }
    }
}
