import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            int sum=0;
            int a;
            for(int i=0; i <N ; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }

            for(int j =N-1; j >=0; j--){
                if(K< arr[j]){
                    continue;
                }
                else {
                    a = K/arr[j];
                    sum += a;
                    K = K - a*arr[j];
                }
            }

            System.out.println(sum);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
