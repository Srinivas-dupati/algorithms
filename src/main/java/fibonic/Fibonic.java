package fibonic;

public class Fibonic {

    public int[] fibonicSeries(int number){
        int[] array=new int[10-1];
        array[0]=0;
        array[1]=1;

        for(int i=2;i<number;i++){
            array[i]=array[i-1] + array [i-2];

        }
        return array;

    }
}
