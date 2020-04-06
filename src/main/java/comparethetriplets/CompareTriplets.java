package comparethetriplets;

import java.util.List;
import java.util.Map;

public class CompareTriplets {
    int[] points=new int[3];
    public int[] comapreTriplets(int[]  array1, int[] array2){
        if(array1.length != array2.length){
           throw new NumberFormatException("array1 and array2 length not same");
        }
      for(int i=0; i<array1.length ;i++){
          if(array1[i] > array2[i]){
              points[0]+=1;
          }
          else if(array1[i] < array2[i]){
              points[1]+=1;
          }
          else{
              points[2]+=1;
          }

      }

        return points;



    }
}
