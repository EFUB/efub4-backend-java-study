import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader((new InputStreamReader(System.in)))) {
            int T = Integer.parseInt(br.readLine()); // 색종이 수
            String str;
            StringTokenizer st;
            int a=0; int b=0;
            int k =1;
            int[][] area = new int[100][100];
            int res =0;


            for (int i =0; i<T; i++){
                str = br.readLine();
                st = new StringTokenizer(str);
                a =Integer.parseInt(st.nextToken()) -1;
                b =Integer.parseInt(st.nextToken()) -1;
                for(int x=a; x < a+10; x++){
                    for(int y=b; y<b+10; y++){
                        if(area[x][y]==1){ continue;}
                        area[x][y] = 1;
                        res +=1;
                    }
                }
            }
            System.out.println(res);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
