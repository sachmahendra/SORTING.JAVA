public class L19HoarsPartition2 {
    static int partition(int arr[], int l, int h){
        int pivote = arr[l];
        int j= h+1;
        l= 0;
        int i=l-1;
        while(true){
            do{
                i++;
            }
            while(arr[i]<pivote);
            do{
                j--;
            }
            while(arr[j]>pivote);
            if(i>=j)
            return j;
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={5,3,8,4,2,7,1,10};
    int n= arr.length;
    partition(arr, 0, n-1);
    for(int i=0; i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
