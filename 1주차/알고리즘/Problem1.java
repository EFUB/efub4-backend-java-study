import java.io.*;
import java.util.StringTokenizer;

public class Problem1{

    public static int[] setAlarm(int H, int M){

        int[] arr = new int[2];

        if(M>=45){
            M-=45;
        }else {
            M+=15;
            H--;
        }

        if(H<0)
            H=23;

        arr[0] = H;
        arr[1] = M;

        return arr;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = setAlarm(h,m);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(arr[0]));
        bw.write(" ");
        bw.write(Integer.toString(arr[1]));
        bw.close();
    }

}