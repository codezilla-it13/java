import java.util.Arrays;
public class InsertionSort {
    public static void insertionsort(int[] a) {
        for(int j=1; j<a.length; j++){
            int key = a[j];
            int i = j-1;
            while ((i>-1) && (a[i] > key)) {
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertions Sort: " + Arrays.toString(arr1));
        insertionsort(arr1);
        System.out.println("After Insertions Sort: " + Arrays.toString(arr1));
    }
}
 