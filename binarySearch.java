public class BinarySearch {

    public static void main(String[] args) {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(data, 3));
    }

    public static int binarySearch(int[] data, int n){
        
        int start, middle, end, r;
        start = 0;
        end = data.length;
        r=-1;

        while(start < end){
            middle = (start + end)/2;

            if(n == data[middle]){
                r=middle;
                break;
            }else if(n < data[middle]){
                end = middle;
            }else{
                start = middle;
            }
        }

        return r;
    }
}