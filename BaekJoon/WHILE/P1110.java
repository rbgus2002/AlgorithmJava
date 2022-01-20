package WHILE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = cycleLength(N);

        System.out.println(answer);
    }
    private static int cycleLength(int N){
        int count = 0;
        int initialN = N;
        do{
            if(N <10) N *= 11;
            else{
                int tenPlace = N / 10;
                int onePlace = N % 10;
                N = (onePlace * 10) + ((tenPlace + onePlace) % 10);
            }
            count++;
        }while(initialN !=N);
        return count;
    }
}

/*
주어진 수가 10 보다 작으면? -> 앞에 0 붙여서 두 자리 수로 만든 후 각 자리 수 더함
주어진 수가 10보다 크면? -> 각 자리수 더한 값과 더하기 전의 오른쪽 자리수와 이어붙이기
 */