package Algorithms;

public class MergeSort {
    public static void main(String[] args){
        int data[] = {5, 7, 2, 9, 3, 4, 0, 1, 6, 10};
        mergeSort(data, 0, data.length-1);
        for(int d: data){
            System.out.print(d);
        }
    }

    public static void mergeSort(int arr[], int beg, int end){
        if(beg == end)return;
        
        if(beg < end ){
            int mid = (beg + end)/2;
        
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, beg, mid, end);
        }
        
    }
    
    public static void merge(int arr[], int beg, int mid, int end){
        int i, j, k;
        int n1 = mid - beg +1;
        int n2 = end - mid;
        
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        for (int n = 0; n < n1; n++) {
            left[n]=arr[beg+n];
        }
        for (int m = 0; m < n2; m++) {
            right[m]=arr[mid +1 +m];
        }
        
        for(int d: left){
            System.out.print(d);
        }
        System.out.print("-");
        
        for(int d: right){
            System.out.print(d);
        }
        System.out.println("");
        
        i=0;
        j=0;
        k=beg;
        
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
         while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
