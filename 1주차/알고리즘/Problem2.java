import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        int[] array = new int [21];
        
        for(int i = 0; i<21; i++){
            array[i] = i;
        }
        
        int count =10;
        
        Scanner sc = new Scanner(System.in);
        
        int mid , temp;
        while(count > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            //짝수 개인 경우
            if(((a+b+1)%2) == 0){
              for(int j =0; j<=((b-a)/2); j++){
                  mid = (a+b+1)/2;
                  temp = array[mid+j];
                  array[mid+j] = array [mid -j-1];
                  array[mid-j-1] = temp;
              }
            }
            //홀수 개인 경우
            else {
                mid = (a+b)/2;
                for(int j = 1; j <=((b-a)/2) ; j++){
                    temp = array[mid+j];
                    array[mid+j] = array[mid-j];
                    array[mid-j] = temp;
                }         
            }
            count --;
        }
        for(int i =1; i<21 ; i++){
                System.out.print(array[i]+" ");
            }
    }
}

