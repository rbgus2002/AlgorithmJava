package BRUTE_FORCE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;  //666이 연속으로 3개 나오는 숫자면 count++
        int i = 665; ///666이 1번째 숫자이므로 665부터 시작
        while (N != count) {
            i++;
            if (thirdSix(i)) count++;
        }
        System.out.println(i);
    }

    private static boolean thirdSix(int input) {
        String num = String.valueOf(input);
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '6') {
                count = 0;
                continue;
            } else {   //6일 때
                if (count == 2) {
                    count++;
                    break;
                }
                count++;
            }
        }
        return count == 3 ? true : false;
    }
}

/*
6이 연속으로 3개 있는 지 체크하는 방법론
1. 내가 했던 방식 처럼 count 만들어서 하나하나 탐색해보기
2. 1000으로 나눈 나머지가 666이 나오면 true
 */