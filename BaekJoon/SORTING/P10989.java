package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder[] sb = new StringBuilder[10001];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sb[num].append(num).append("\n");
        }
        for (int i = 0; i < sb.length; i++) {
            if(!sb[i].toString().isEmpty()) System.out.print(sb[i]);
        }
    }
}

//굳이 StringBuilder 쓸 필요는 없고 그냥 int[] 배열 만들어서 ++하고 0 아닌거만 출력해도 되넹