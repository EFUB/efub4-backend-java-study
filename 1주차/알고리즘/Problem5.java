// 11047 동전 0
/* 문제: N종류의 동전 가짐. 일부 가치 사용해 합이 K가 되도록. 동전 개수 최솟값 구하기.
 * 입력: 첫째 줄에 N, K 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
 *   둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
 *   (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 * 출력: 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 */

import java.util.Scanner;

public class Main {
    public static void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            if (k == 0)
                break;
            count += k / coins[i];
            k %= coins[i];
        }
        System.out.print(count);
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}