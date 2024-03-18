import java.io.*;
import java.util.StringTokenizer;

public class Problem2{

    private static int[] arr;

    public static void reverse(int start, int end){
        int count = (end - start + 1)/2;
        int temp;
        for(int i=0; i<count; i++){
            temp = arr[start+i-1];
            arr[start+i-1] = arr[end-i-1];
            arr[end-i-1] = temp;
        }
    }

    public static void main(String[] args) throws IOException {

        //배열 초기화
        arr = new int[20];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }


        //뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            reverse(start,end);
        }

        //출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<arr.length; i++){
            bw.write(Integer.toString(arr[i]));
            bw.write(" ");
        }
        bw.close();

    }
}