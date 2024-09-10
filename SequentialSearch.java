class SequentialSearch{
    public static void main(String[] args) {
        int[] arr = {2,9,5,0,2,8,1,7};
        int target = 1;
        sequentialsearch(target, arr);
    }
    public static void sequentialsearch(int t, int a[]) {
        int index = -1;
        for(int i=0; i<a.length; i++){
            if(a[i] == t){
                index = i;
                System.out.println("The Target " + t + " is found at Position " + index);
                break;}
        }
        if(index == -1){
            System.out.println("Targer is not Found!");
        }
    }
}