// 10798번 세로읽기
/* 문제: 영석이는 칠판에 만들어진 다섯 개의 단어를 세로로 읽으려 한다.
 * 입력: 총 다섯줄의 입력. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다.
 *   주어지는 글자: ‘A’~‘Z’ 또는 ‘a’~‘z’ 또는 ‘0’~‘9’.
 * 출력: 영석이가 세로로 읽은 순서대로 글자들을 출력한다. 공백 없이 연속해서 출력한다.
 */

import java.util.Scanner;

public class Main {
    public static void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] strList = new String[5];
        int maxLength = 0;
        int index = 0;
        for (int i=0; i<5; i++) {
            strList[i] = sc.next();
            if (strList[i].length() > maxLength)
                maxLength = strList[i].length();
        }
        while (index < maxLength) {
            for (int i=0; i<5; i++) {
                if (strList[i].length() > index) {
                    System.out.print(strList[i].charAt(index));
                }
            }
            index++;
        }
    }
    public static void main(String[] args) throws Exception {
        solution();
    }
}