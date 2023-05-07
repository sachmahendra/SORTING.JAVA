public class L30SortArrayBY0s1s2s {
    public static void sort012(int a[], int n)
    {
        // code here 
        int low=0;
        int mid=0;
        int hi=n-1;
        while(mid<=hi){
            if(a[mid]==0){
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
                
            }
            else if(a[mid]==1){
                mid++;
            }
            
            else{
                int temp=a[hi];
                a[hi]=a[mid];
                a[mid]=temp;
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{0,1,1,2,0,1,1,2};
        
        int n = arr.length;
        
        sort012(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
    }
}
