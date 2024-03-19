package 알고리즘;

import java.io.*;
import java.util.*;

public class Problem1 {

    public static void main(String[] args) throws IOException{

        char[] result = new char[3];
        int sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int y3 = Integer.parseInt(st.nextToken());
            int y4 = Integer.parseInt(st.nextToken());
            sum = y1 + y2 + y3 + y4;
            switch(sum){
                case 0: result[i] = 'D'; break;
                case 1: result[i] = 'C'; break;
                case 2: result[i] = 'B'; break;
                case 3: result[i] = 'A'; break;
                case 4: result[i] = 'E'; break;
            }
            sum = 0;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(result[0]);
        bw.newLine();
        bw.write(result[1]);
        bw.newLine();
        bw.write(result[2]);

        bw.close();


    }
}