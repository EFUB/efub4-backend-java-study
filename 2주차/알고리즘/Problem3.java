package 알고리즘;

import java.io.*;
import java.util.*;

public class Problem3{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int width = 0;
        int x,y;

        int[][] coordinate = new int[100][100];

        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    coordinate[j][k] = 1;
                }
            }
        }

        for(int i=0; i<100; i++){
            for(int j=99; j>0; j--){
                width+=coordinate[i][j];
            }
        }

        bw.write(Integer.toString(width));
        bw.close();
    }
}