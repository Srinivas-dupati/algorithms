package sumofpluseminus;

public class PluseMinus {

    public void pluseMinus(int[] array){
       int pCounter = 0;
       int nCounter=0;
       int zeroCounter=0;
       double pCounResult=0.0;
        double nCounResult=0.0;
        double zCounResult=0.0;
        for (int i = 0; i <array.length; i++) {
            if(array[i] > 0)
                pCounter+=1;

            else if(array[i] < 0)
                nCounter+=1;

            else
                zeroCounter+=1;

        }
        pCounResult=pCounter%array.length;
        System.out.println("pCounResult ="+pCounResult);

        nCounResult=nCounter%array.length;
        System.out.println("nCounResult ="+nCounResult);

        zCounResult=zeroCounter%array.length;
        System.out.println("zCounResult ="+zCounResult);


    }
}
