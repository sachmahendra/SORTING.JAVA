public class L18LomutoPartitonAlgo {
    static int lPartition(int arr[], int l, int h){
        int pivote = arr[h];
        int i=l-1;
        for(int j=l; j<h;j++){
            if(arr[j]<pivote){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp= arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]= {10,80,30,90,40,50,70};
        int n = arr.length;
        int l= 0;
        int h= n-1;
        lPartition(arr,l,h);
        for(int i=l;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
