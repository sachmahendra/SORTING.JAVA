
 //THIS IS A DIFFERENT METHOD THEN METHOD OF LECTURE 29 , WITH THIS METHOD AFTER OPERATION 
 //ORDER OF ELEMENT REMAINS SAME 
 // FOR REVISION WATCH YOUTUBE VDO

public class L29SegregateEvenOddInSameOrder {
    static void SegEvenOdd(int arr[], int n){
        if(n==0 || n==1){
            return;
        }
        int a[]= new int[n];  // MAKE ANOTHER ARRAY OF SAME SIZE
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]%2==0){    // FIRST STORE ALL +VE VALUES
                a[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]%2 != 0){ // NOW STORE ALL NEGATIVE VALUES IN ARRAY
                a[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<n;j++){  // NOW MOVE ALL ELEMENT IN ORIGINAL ARRAY 
            arr[j]=a[j];
        }
    }
    public static void main(String[] args) {
        int arr[]= {15,7,14,13,12};
        int n=5;
        SegEvenOdd(arr, n);
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
