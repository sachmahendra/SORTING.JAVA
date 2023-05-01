public class L16CountInversion {
    static int countInv(int arr[], int l, int r){
        int res =0;
        if(l<r){
            int m= l+(r-l)/2;
            res += countInv(arr, l, m);
            res += countInv(arr, m+1, r);
            res += countandMerge(arr, l, m, r);

        }
        return res;
    }

    static int countandMerge(int arr[], int l, int m, int r){
        int n1 = m-l+1; 
        int n2= r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0; i< n1; i++){
            left[i]= arr[i+l];
        }
        for(int j=0; j<n2; j++){
            right[j]= arr[m+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        int res=0;
        while(i<n1 && j< n2){
            if(left[i]<= right[j]){
                arr[k++]= left[i++];
            }
            else{
                arr[k++]=right[j++];
                res = res + (n1-i);
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]= right[j++];
        }

        return res;



    }
    public static void main(String[] args) {
        int arr[] = new int[]{2,4,1,3,5};
        
        int n = arr.length;
	    System.out.print(countInv(arr,0,n-1));
    }
}
