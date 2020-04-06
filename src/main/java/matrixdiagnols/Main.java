package matrixdiagnols;

public class Main {
    public static void main(String[] args) {
        int[] [] matrix3by3 =new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        //{1,2,3}
        //{4,5,6}
        //{7,8,9}

        MatrixDiagnols matrixDiagnols=new MatrixDiagnols();
        matrixDiagnols.matrixDiagnolsPrint(matrix3by3);
    }
}
