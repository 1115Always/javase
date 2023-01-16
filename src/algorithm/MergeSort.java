package algorithm;

public class MergeSort {

    public static void main(String[] args) {
    }

    public static void mergeSort(int[] arr) {
        int[] orderedArr = new int[arr.length];

        for (int i = 2; i < arr.length * 2; i *= 2) {
            for (int j = 0; j < (arr.length + i - 1) / i; j++) {
                int left = i * j;
                int mid = left + i / 2 >= arr.length ? (arr.length - 1) : (left + i / 2);
                int right = i * (j + 1) - 1 >= arr.length ? (arr.length - 1) : (i * (j + 1) - 1);
                int start = left;
                int l = left;
                int m = mid;
                while (l < mid && m <= right) {
                    if (arr[l] < arr[m]) {

                    }
                }
            }
        }
    }
}
