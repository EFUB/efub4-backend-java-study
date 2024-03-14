import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        int[] array = new int [5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i =0; i<5; i++){
            array[i] = sc.nextInt();
        }
        
        int sum =0;
        for (int i =0; i<5; i++){
            sum += array[i];
        }
        
        int medium = sum /5;
        
        Arrays.sort(array);
        
        int median = array[2];
        
        System.out.println(medium + " "+ median);
    }
}

