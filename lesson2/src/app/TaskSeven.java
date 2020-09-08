package app;

public class TaskSeven {

    public int[] shiftArr( int[] arr, int shift ) {
        int size = arr.length;
        if ( shift > 0 ) {
            for (int i = 0; i < shift; i++) {
                int temp = arr[size - 1];

                for (int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }
        } else {
            shift = Math.abs( shift );
            for (int i = 0; i < shift; i++) {
                int temp = arr[0];

                for (int j = 0; j < size-1; j++) {
                    arr[j] = arr[j+1];
                }

                arr[size-1] = temp;
            }
        }
        return arr;
    }
}
