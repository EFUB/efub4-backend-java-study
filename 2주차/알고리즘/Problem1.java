import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] str = new String[3];
            StringTokenizer st;
            int sum =0;
            int x =0;

            // 한 줄씩 배열에 저장
            for (int i=0; i<3 ; i++) {
                str[i] = br.readLine();
            }

            // 각 배열의 윷짝 상태 구하기
            for (String string : str) {
                st = new StringTokenizer(string);
                for(int j=0; j <4; j++){
                    x = Integer.parseInt(st.nextToken());
                    if (x==0){
                        sum += 1;
                    }
                }
                switch (sum){
                    case 0 :
                        System.out.println("E"); //모
                        break;
                    case 1 :
                        System.out.println("A"); //도
                        break;
                    case 2 :
                        System.out.println("B"); //개
                        break;
                    case 3 :
                        System.out.println("C"); //걸
                        break;
                    case 4 :
                        System.out.println("D"); //윷
                        break;
                }
                sum = 0;
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
