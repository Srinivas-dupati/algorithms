package rotatedArraySort;

public class RotatedArraySort {
    public int roatateArraySort(int[] list1, int[] list2) {
        int sum1 = 0;
        int sum2 = 0;
        int finalResult = 0;
        int[] result1 = arraySort(list1, 0, list1.length - 1);
        int[] result2 = arraySort(list2, 0, list2.length - 1);

        for (int i = 0; i < result1.length; i++) {
            sum1 += result1[i];

        }
        for (int i = 0; i < result2.length; i++) {
            sum2 += result2[i];

        }
        finalResult = sum1 + sum2;
        return (Integer.valueOf(rotateFinalResult(finalResult)));
    }

    String num = "";

    private String rotateFinalResult(int finalResult) {
        int result = 0;

        if (finalResult > 0) {
            num += finalResult % 10;

            return rotateFinalResult(finalResult / 10);
        }
        return num;
    }

    private int[] arraySort(int[] araay, int low, int high) {

        int i = low;
        int j = high;
        int mid = (low + high) / 2;
        int pivot = araay[mid];

        while (i < j) {

            while (araay[i] < pivot)
                i++;

            while (araay[j] > pivot)
                j--;

            while (i <= j) {
                int temp = araay[i];
                araay[i] = araay[j];
                araay[j] = temp;
                i++;
                j--;
            }

            if (low < j) {
                arraySort(araay, low, j);

            }
            if (high > j) {
                arraySort(araay, i, high);
            }
        }
        return araay;
    }
}
