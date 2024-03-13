import java.io.*;
import java.util.*;
public class Problem4{
    public static void main(String[] args) throws IOException{
        List<Integer> list = new ArrayList<>();
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        for(int i=0; i<str.length; i++){
            list.add(Integer.parseInt(str[i]));
        }

        //정렬
        list.sort(Comparator.reverseOrder());

        //출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<list.size(); i++){
            bw.write(Integer.toString(list.get(i)));
        }
        bw.close();
    }
}