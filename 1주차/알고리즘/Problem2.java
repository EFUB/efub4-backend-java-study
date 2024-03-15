//2. 카드 역배치

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 카드 20장
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        // 10개의 구간 입력
        for (int i = 0; i < 10; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            reverse(arr, start, end);
        }

        // 결과 출력
        for (int card : arr) {
            System.out.print(card + " ");
        }
    }

    // 배열의 특정 구간을 역순으로 변경하는 메서드
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
