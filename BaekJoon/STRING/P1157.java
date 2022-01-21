package STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toLowerCase();
        int[] alphabet = new int[26];
        int index = -1, max = 0;

        for (int i = 0; i < word.length(); i++) {
            alphabet[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                index = i;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            if(max == alphabet[i] && index != i){
                System.out.println("?");
                return;
            }
        }

        System.out.println(String.format("%c", index + 'a').toUpperCase());
    }
}
