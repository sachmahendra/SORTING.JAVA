import java.util.*;

public class primeNumber {
    static void prime(int n){
        int temp =0;
        for(int i=2; i<n ; i++)
        {
            
            if(n % i ==0)
            {
                temp = temp +1;
            }
        }
        
        if(temp == 0){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
    public static void main(String[] args) {
       //int n= 11;
       prime(15);

    }      
}
