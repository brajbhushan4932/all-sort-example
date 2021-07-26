package com.sort;

public class QuickSortSample {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 30, 50, 24, 12, 18, 0};
        int n = arr.length;

        int start = 0;
        int end = n - 1;
        quickSort(arr, start, end);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = arrPartition(arr, start, end);

            quickSort(arr, start, pi - 1);
            quickSort(arr, pi , end);
        }
    }

    private static int arrPartition(int[] arr, int start, int end) {
        /* partition for pivot at start position*/
       /* int pivot = arr[start];
        int i = end+1;
        for(int j=end;j>=0;j--){
            if(arr[j] > pivot){
                i--;
                swap(arr,i,j);
            }
        }
        swap(arr,i-1,start);
        return (i-1);*/
        /*end of code*/

        /* partition for pivot at end position */
       /* int pivot = arr[end];
        int i = start-1;

        for(int j=start;j<end;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return (i+1);*/
        /*end of code*/

        /* partition for pivot at middle position*/
        int mid = (start + end) / 2;
        int pivot = arr[mid];
        /*int i = start - 1;

        for (int j = start; j < mid; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, mid);
        int m = end + 1;
        for (int j = end; j >= (i+1); j--) {
            if (arr[j] > pivot) {
                m--;
                swap(arr, j, m);
            }
        }
        swap(arr, m - 1, i+1);
        return (m - 1);*/
        int i = start,j = end;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
        /*end of code*/
    }

    private static void swap(int[] arr, int arrEl, int pivotEl) {
        int temp = arr[arrEl];
        arr[arrEl] = arr[pivotEl];
        arr[pivotEl] = temp;
    }
}
