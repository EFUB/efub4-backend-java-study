import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int[] cards = new int[20]; // 카드 배열 생성
            String[] str = new String[10]; //입력 읽기
            StringTokenizer st ;
            int a = 0;
            int b = 0;

            for(int i=0; i <20 ; i++){ // 카드 초기화
                cards[i]=i+1;
            }

            for (int i=0; i<10; i++) { // 입력값 한 줄 씩 배열로 저장
                str[i] = br.readLine();
            }

            for(String string : str){ // 각 구간 카드 역순 배열
                st = new StringTokenizer(string);
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                int temp =0;
                int p = (int)((a+b) /2);
                int y = b-1;

                for (int x = a-1 ; x<p ; x++) {  // 구간 뒤집기 함수
                    temp = cards[x];
                    cards[x] = cards[y];
                    cards[y] = temp;
                    y--;
                }
            }

            for (int card: cards) { // 최종 카드 배열 출력
                System.out.print(card + " ");
            }
            System.out.println();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
