import java.util.Arrays;

public class InsertionSort implements Runnable {
    private int[] sortArr;

    public InsertionSort(int[] sortArr) {
        this.sortArr = sortArr;
    }

    @Override
    public void run() {
        int j;
        for (int i = 0; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
        System.out.println(Arrays.toString(sortArr));

    }
}
