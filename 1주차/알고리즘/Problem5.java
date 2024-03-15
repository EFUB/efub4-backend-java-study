import java.util.*;

public class Main
{
    
    public static void main(String[] args) {
        
        int n , k;
        int count =0;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int [n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = n-1; i>=0; i--){
            if(arr[i]<= k){
                count += k/arr[i];
                k %= arr[i];
            }
        }
        
        System.out.print(count);
        
    }
}

