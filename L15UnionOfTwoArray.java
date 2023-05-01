public class L15UnionOfTwoArray {
    static void Union(int a[], int b[], int m, int n){
        int i=0 ; 
        int j=0;
        while(i< m && j< n){
            if(i >0 && a[i]==a[i-1]){i++; continue;}
            if(j >0 && b[j]==b[j-1]){j++; continue;}
            if(a[i] < b[j]){
                System.out.println(a[i]+" ");
                i++;
            }
            else if(a[i]>b[j]){
                System.out.println(b[j]+" ");
                j++;
            }
            else{
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
        while(i<m){
            if(i>0 && a[i]!=a[i-1]){
                System.out.println(a[i]+" ");
                i++;
            }
        }
        while(j<n){
            if(j>0 && b[j]!=b[j-1]){
                System.out.println(b[j]+" ");
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={2,10,20,20};
        int b[]={2,3,20,40};
        int m= a.length;
        int n= b.length;
        Union(a, b, m, n);
        
    }
}

/* 

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
      //  Arrays.sort(a);
    //    Arrays.sort(b);
        int i=0;
        int j=0;
        int c1=0;
        int c2=0;
        int c3=0;
        int count=0;
        while(i<n && j< m){
            if(i>0 && a[i]==a[i-1]){i++; continue;}
            if(j>0 && b[j]==b[j-1]){j++; continue;}
            
            if(a[i] < b[j]){
                i++;
            }
            else if(a[i] >b[j]){
                j++;
            }
            else{
               // count++;
               c1++;
                i++;
                j++;
            }
            
        }
        while(i<n){
            if(i>0 && a[i]!=a[i-1]){
                c2++;
                i++;
            }
        }
        while(j<m){
            if(j>0 && b[j]!=b[j-1]){
                c3++;
               // count++;
                j++;
            }
        }
        count = c1+c2+c3;
        return count;
    }
}

*/
