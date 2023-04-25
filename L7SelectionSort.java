import java.io.*;

public class L7SelectionSort {
    static void selectionSort(int arr[], int n ){
        for(int i=0; i< n; i++){
           int index= i;
           for(int j = i+1;j< n; j++){
            if(arr[j]< arr[index]){
            index = j;
            }
        }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

           
           }
        }
        
        
    
    public static void main(String[] args) {
        int arr[] = {32,6,54,2,8,15};
        int n= 6;
        System.out.println("before sorting");
        for(int i= 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr, n);
        System.out.println("after sorting");
        for(int i=0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
