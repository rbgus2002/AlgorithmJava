package STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(croatiaAlphabetNum(word));
    }

    private static int croatiaAlphabetNum(String word) {
        int numCount = 0;
        char[] input = word.toCharArray();

        for (int i = 0; i < input.length; i++) {
            if (i < input.length - 1) {
                if (input[i] == 'c' && (input[i + 1] == '=' || input[i + 1] == '-')) {
                    numCount++;
                    i++;
                } else if (i < input.length -2 && (input[i] == 'd' && input[i + 1] == 'z' && input[i + 2] == '=')) {
                    numCount++;
                    i += 2;
                } else if (input[i] == 'd' && input[i + 1] == '-') {
                    numCount++;
                    i++;
                } else if (input[i] == 'l' && input[i + 1] == 'j') {
                    numCount++;
                    i++;
                } else if (input[i] == 'n' && input[i + 1] == 'j') {
                    numCount++;
                    i++;
                } else if (input[i] == 's' && input[i + 1] == '=') {
                    numCount++;
                    i++;
                } else if (input[i] == 'z' && input[i + 1] == '=') {
                    numCount++;
                    i++;
                } else numCount++;
            } else numCount++;
        }

        return numCount;
    }
}

/*
c, c=, c-
d, dz=, d-
l, lj
n, nj
s, s=
z, z=
*/