public class L30partitionOfArrayInRange {

    public static int threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int n= array.length;
        int low=0;
        int mid=0;
        int hi=n-1;
        
        while(mid<=hi){
            if(array[mid]<a){
                int temp=array[low];
                array[low]=array[mid];
                array[mid]=temp;
                low++;
                mid++;
            }
            else if(array[mid]>=a && array[mid]<=b){
                mid++;
            }
            else{
                int temp= array[mid];
                 array[mid]= array[hi];
                 array[hi]=temp;
                 hi--;
            }
            
        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{10,5,6,3,20,9,40,8};
        
        int n = arr.length;
        int a=5;
        int b=10;
        
        threeWayPartition(arr,a,b);
	
	    for(int x:arr)
            System.out.print(x+" ");
    }
}
