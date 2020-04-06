package matrixdiagnols;

public class MatrixDiagnols {


    String diagnols1="";
    String diagnols2="";

    public void matrixDiagnolsPrint(int[][] matrix){

        int matrixLength= matrix.length;
        for (int i = 0; i <matrixLength ; i++) {
            diagnols1+= matrix[i][i];
            diagnols2+=matrix[i][matrixLength-1-1];
        }
        System.out.println("Diagnol= "+diagnols1);
        System.out.println("Diagno2= "+diagnols2);


    }
}
