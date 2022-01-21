package STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }   //모든 요소 -1로 초기화 -> 없으면 -1이므로

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (i + 'a' == word.charAt(j) && alphabet[i] == -1) alphabet[i] = j;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
