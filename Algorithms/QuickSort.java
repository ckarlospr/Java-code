package Algorithms;
public class QuickSort {
    public static void main(String[] args){
        int data[] = {5, 7, 2, 9, 3, 4, 0, 1, 6, };
        quickSort(data, 0, data.length-1);
        for(int d: data){
            System.out.println(d);
        }
    }

    public static void quickSort(int arr[], int start, int end){
        if(start >= end)return;
        
        int index = partition(arr, start, end);
        quickSort(arr, start, index-1);
        quickSort(arr, index+1, end);
    }
    
    public static int partition(int arr[], int start, int end){
        int pivotIndex = start;
        int pivotValue = arr[end];
        for (int i = start; i < end; i++) {
            if(arr[i] < pivotValue){
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(arr, pivotIndex, end);
        
        return pivotIndex;
    }
    
    public static void swap(int arr[], int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
    
}
