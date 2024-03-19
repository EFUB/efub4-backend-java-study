package 알고리즘;

import java.io.*;
import java.util.*;

public class Problem2{
    public static void main(String[] args) throws IOException{

        List<List<Character>> list = new ArrayList<>();
        int max = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<5; i++){
            List<Character> input = new ArrayList<>();
            String str = br.readLine();

            max = max>str.length()? max:str.length();

            for(int j=0; j<str.length(); j++){
                input.add(str.charAt(j));
            }
            list.add(input);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){
                if(list.get(j).size()>i){
                    bw.write(list.get(j).get(i));
                }
            }
        }

        bw.close();

    }
}