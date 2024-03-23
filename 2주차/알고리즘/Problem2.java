import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = "";
            char [][] word = new char[5][15];
            int max = 0;

            for(int i=0; i<5; i++){
                str = br.readLine();
                if (str.length() > max){
                    max = str.length();
                }
                for (int j=0; j<str.length(); j++){
                    word[i][j] = str.charAt(j);
                }
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0; i < max; i++){
                for(int j=0; j <5 ;j++){
                    if(word[j][i] == '\0') continue;
                    sb.append(word[j][i]);
                }
            }
            System.out.println(sb);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
