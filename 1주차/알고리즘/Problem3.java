import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int sum = 0;
            int ave = 0;
            int mid = 0;
            int[] num = new int[5];

            for (int i=0; i <5 ; i++){
                num[i] = Integer.parseInt(br.readLine());
                sum += num[i];
            }

            ave = sum/5;
            Arrays.sort(num); //정렬 메소드 사용
            mid = num[2];

            System.out.println(ave);
            System.out.println(mid);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

