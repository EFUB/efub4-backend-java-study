import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] cards = new int[20];
        for(int i=0; i<20; i++){
            cards[i] = i+1;
        }

        for(int i=0; i<10; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            while(start < end){
                int temp = cards[start - 1];
                cards[start - 1] = cards[end - 1];
                cards[end - 1] = temp;
                start++;
                end--;
            }
        }

        for(int i=0; i<cards.length; i++){
            System.out.print(cards[i] + " ");
        }



    }
}
