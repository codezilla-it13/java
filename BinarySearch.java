import java.util.Arrays;
class BinarySearch {
    public static void binarysearch(int[] a, int first, int last, int key){
        int mid = (first + last)/2;
        while(first <= last){
            if(a[mid] > key){
                last = mid - 1;
            }else if(a[mid] < key){
                first = mid + 1;
            }else{
                System.out.println("The Value " + key + " is found at Position " + (mid+1));
                return;
            }
            mid = (first + last)/2;
        }
        System.out.println("The Target is not found");
    }
    public static void main(String[] args) {
        int[] arr = {2,9,5,0,2,8,1,7};
        Arrays.sort(arr);   //to use binary search array must be sorted
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int target = 6;
        binarysearch(arr, 0, (arr.length - 1), target);
    }    
}
