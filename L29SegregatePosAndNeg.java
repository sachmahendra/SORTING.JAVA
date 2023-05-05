// this solution is based on quick sort HOARS algo 

// THIS CAN ALSO SOLVED BY ARRAY LECTURE 12 CONCEPT

public class L29SegregatePosAndNeg {
    static void segPosNeg(int arr[], int n){
        int i =-1;
        int j=n;
        while(true){
            do{
                i++;
            }
            while(arr[i]<0);

            do{
                j--;
            }
            while(arr[j]>0);
            if(i>=j){
                return;
             }
             int temp= arr[i];
             arr[i]= arr[j];
             arr[j]= temp;
            }
    }
    public static void main(String[] args) {
        int arr[]={15,-3,14,-2,-5};
        int n=5;
        System.out.println("before operation");
        for(int i=0; i<n;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        segPosNeg(arr, n);
        System.out.println("after operation");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
            }
        
    }
}
