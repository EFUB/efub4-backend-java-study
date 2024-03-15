import java.util.*;

public class Main
{
    
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        while(input >0){
            array.add(input %10);
	        input /= 10;
        }
        
        Collections.sort(array, Collections.reverseOrder());
        
        for(int i = 0; i<array.size(); i++){
            System.out.print(array.get(i));
        }
    }
}

