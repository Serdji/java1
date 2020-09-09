package app;

public class TaskTwo {

    public int[] generateArrSize(int size, int step) {
        int[] arr = new int[size];
        int res = 0;
        for (int i = 0; i < size; i++) {
            res += i == 0 ? i : step;
            arr[i] =  res;
        }
        return arr;
    }
}
