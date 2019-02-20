package controller;

import java.util.List;

public class HeapController {
    public void buildHeap(List<Integer> arr) {
        for (int i = (arr.size() - 1) / 2; i >= 0; i--) {
            buildMaxHeap(arr, i, arr.size() - 1);
        }
    }

    public void buildMaxHeap(List<Integer> arr, int i, int N) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && arr.get(left) > arr.get(i)) max = left;
        if (right <= N && arr.get(right) > arr.get(max)) max = right;
        if (max != i) {
            swap(arr, i, max);
            buildMaxHeap(arr, max, N);
        }
    }
    public void swap(List<Integer> arr, int i, int j) {
        int tmp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, tmp);
    }

}
