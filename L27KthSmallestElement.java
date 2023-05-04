public class L27KthSmallestElement {

    static int lPartition(int arr[], int l, int r){
        int pivote = arr[r];
        int i=l-1;
        for(int j=l;j<=r-1;j++){
            if(arr[j]<pivote)
            {
                i++;
                int temp =arr[i];
                 arr[i]= arr[j];
                 arr[j]=temp;
            }
        }
        int temp= arr[i+1];
        arr[i+1]= arr[r];
        arr[r]= temp;
        return i+1;
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int n= arr.length;
        l=0;
        r=n-1;
        while(l<=r){
            int p = lPartition(arr, l, r);
            if(p== k-1)
            return p;
            else if(p > k-1)
            r=p-1;
            else
            l=p+1;
            
        }
        return -1;
    } 

    public static void main(String[] args) {
        int arr[]={10,4,5,8,11,6,26};
        int n=7;
        int k=5;
        int l=0;
        int r= n-1;

      int index= kthSmallest(arr, l, r, k);
      System.out.println(arr[index]);
    }
}
