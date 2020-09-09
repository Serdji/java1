package app;

public class TaskOne {

    public int[] binaryArrInvert ( int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        return arr;
    }

}
