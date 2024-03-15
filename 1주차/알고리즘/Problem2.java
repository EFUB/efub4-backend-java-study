// 10804번 카드 역배치
/* 문제: 20장의 카드가 오름차순으로 놓여있다.
 *   10개의 [a, b] 구간이 주어지면 해당 구간에서 카드들의 위치를 반전하라.
 * 입력: 총 10개의 줄에 걸쳐 한 줄에 하나씩 10개의 구간이 주어진다.
 *   i번째 줄에 시작 위치 ai와 끝 위치 bi가 주어진다 (범위: 1 ≤ ai ≤ bi ≤ 20)
 * 출력:마지막 카드들의 배치를 한 줄에 출력한다.
 */

import java.util.Scanner;

public class Main {
    // 카드 위치 반전 메서드
    public static void swap(int[] cards, int a, int b) {
        for (int i = 0; i < (b - a + 1) / 2; i++) {
            int temp = cards[a + i];
            cards[a + i] = cards[b - i];
            cards[b - i] = temp;
        }
    }

    public static void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] cards = new int[20];
        // 카드들 초기화
        for (int i = 0; i < 20; i++) {
            cards[i] = i + 1;
        }
        // 10개 구간 반복
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            swap(cards, a, b);
        }
        // 출력
        for (int i = 0; i < 20; i++) {
            System.out.print(cards[i]);
            if (i != 19)
                System.out.print(" ");
        }
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}