import java.io.*;
import java.util.*;

public class Problem5{
    public static void main(String[] args) throws IOException{
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int result = 0;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //계산
        for(int i=0; i<N; i++){
            result += K / arr[N-1-i];
            K %= arr[N-1-i];
        }

        //출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(result));
        bw.close();
    }
}