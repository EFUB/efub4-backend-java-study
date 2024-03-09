import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = br.readLine();
            int[] arr = new int[str.length()];
            int i =0;

            for (String s: str.split("")) {
                arr[i] = Integer.parseInt(s);
                i++;
            }

            Arrays.sort(arr);

            int temp =0;
            int y = arr.length -1;
            for (int x =0; x <= y ; x++) {  // 구간 뒤집기 함수
                temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                y--;
            }

            for (int array: arr) { // 최종  배열 출력
                System.out.print(array);
            }
            System.out.println();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
