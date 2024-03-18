import java.io.*;
import java.util.*;
public class Problem3{
    public static void main(String[] args) throws IOException{
        int[] arr = new int[5];
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }

        Arrays.sort(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(sum/arr.length));
        bw.newLine();
        bw.write(Integer.toString(arr[2]));
        bw.close();
    }
}