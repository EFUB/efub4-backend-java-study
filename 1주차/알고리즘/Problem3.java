// 2587번 대표값2
/* 문제: 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오
 * 입력: 1~5번째 줄에 자연수 1개씩 주어진다. (자연수는 100보다 작은 10의 배수)
 * 출력: 첫째 줄에는 평균을 출력하고, 둘째 줄에는 중앙값을 출력한다. 평균과 중앙값은 모두 자연수.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int average = 0;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            average += n;
            numbers[i] = n;
        }
        average /= 5;
        Arrays.sort(numbers);
        System.out.print(average + "\n" + numbers[2]);
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}