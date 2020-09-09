package app;

public class TaskFive {

    public int[] minAndMax(int[] arr) {
        int[] res = new int[2];
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        res[0] = min;
        res[1] = max;
        return res;
    }
}
