import java.util.Scanner;
class SelectionSort{
    void sort(int a[]){
        for(int i = 0; i < (a.length - 1); i++){
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    void printarr(int a[]){
        System.out.print("The Sorted Array: ");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%d ", a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = Integer.parseInt(obj.nextLine());
        int arr[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(obj.nextLine());
        }
        SelectionSort ob = new SelectionSort();
        ob.sort(arr);
        ob.printarr(arr);
        obj.close();
    }
}