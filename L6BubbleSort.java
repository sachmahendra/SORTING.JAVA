public class L6BubbleSort {
   static boolean bubbleSort(int arr[]){
        int n= arr.length;
        for(int i = 0; i<n-1; i++){
            boolean swapped = false;
           for(int j=0 ; j<n-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
                swapped = true;
            }
           }
           if(swapped == false)
           break;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};
        int n= 5;
       
        System.out.print("before sorting ");
        System.out.println();
        for(int i= 0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);

        System.out.println("After sorting");
        for(int i = 0; i< n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
