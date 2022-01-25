package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P1181 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int wordNum = Integer.parseInt(br.readLine());
        String[] word = new String[wordNum];

        for (int i = 0; i < word.length; i++) {
            word[i] = br.readLine();
        }
        // 여기까지 입력

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length() - o2.length();
            }
        });

        delDuplicated(word);

        for (int i = 0; i < word.length; i++) {
            if (word[i] != null) System.out.println(word[i]);
        }
    }


    private static void delDuplicated(String[] array) {    //중복 제거
        for (int i = 0, count = 0; i < array.length - 1; i += count + 1) {
            count = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = null;
                    count++;
                } else break;
            }
        }
    }
}
/*
2차원 배열로 만들어서 (단어, 길이)로 저장 후 길이 값으로 정렬하고 길이가 같은 것들은 사전순으로 재배치
 */
