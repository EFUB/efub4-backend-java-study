// 2563번 색종이
/* 문제: 정사각형 모양 흰색 도화지(가로, 세로 100)에 정사각형 모양 검은색 색종이(가로, 세로 10)를 붙인다.
 *   색종이들이 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 색종이의 수가 주어지고, 둘째 줄부터 색종이 수 개수 만큼 색종이를 붙인 위치가 주어진다.
 *   색종이를 붙인 위치는 두 개의 자연수로 주어진다. (왼쪽 거리, 아래쪽 거리)
 *   색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다.
 * 출력: 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.
 */

import java.util.Scanner;

public class Main {
    public static void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] paper = new int[100][100];
        int count = sc.nextInt();
        int area = 0;
        for (int i=0; i<count; i++) {
            int left = sc.nextInt();
            int down = sc.nextInt();
            for (int j=0; j<10; j++){
                for (int k=0; k<10; k++) {
                    if (paper[left + k][down + j] == 0) {
                        area++;
                        paper[left + k][down + j] = 1;
                    }
                }
            }
        }
        System.out.print(area);
    }
    public static void main(String[] args) throws Exception {
        solution();
    }
}