package app;

public class TaskThree {

    public int[] multiArr( int[] arr, int minInterval, int multiVal ) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < minInterval ? arr[i] * multiVal : arr[i];
        }
        return arr;
    }
}
