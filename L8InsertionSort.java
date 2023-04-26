public class L8InsertionSort {
    static void selectionSort(int arr[], int n){
       for(int i=1; i< n;i++){
        int key = arr[i];
        int j = i-1;

        while(j>= 0 && arr[j]> key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;

       }

    }
    public static void main(String[] args) {
        int arr[] = {10, 15, 25, 5, 2, 45};
        int n= 6;
        System.out.println("before sorting");
        for(int i=0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr, n);
        System.out.println("after sorting");
        for(int i= 0; i< n ; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
