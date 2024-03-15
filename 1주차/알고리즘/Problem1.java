import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int H = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (M >= 45) { // M이 45분 이상일 때
                M -= 45;
            } else { // M이 45분 미만일 때 H수정 필요
                H = H-1;
                M = (M + 60) - 45;
                if (H == -1) { // 수정된 H가 -1인 경유
                    H = 23;
                }
            }
            System.out.printf("%d %d\n", H, M);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
