public class L10MergeSortr {
    static void mergeSort(int a[] , int b[], int m, int n){
         m= a.length;
         n = b.length;
         int i=0; 
         int j=0;
         while(i<m && j< n){
            if(a[i] <= b[j]){
            System.out.print(a[i++]+" ");
            }
            else{
           System.out.print(b[j++]+" ");
            }
         }
         while(i<m){
            System.out.print(a[i++]+" ");
         }
         while(j<n){
            System.out.print(b[j++]+" ");
         }
        
    }
    public static void main(String[] args) {
        int a[] = {10,15,20,40};
        int b[] = {5,6,6,10,15};
        
        int m = a.length;
        int n = b.length;
        mergeSort(a,b,m,n); 

    }
}
