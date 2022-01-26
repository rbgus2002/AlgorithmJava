package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder[] sb = new StringBuilder[201];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            sb[age].append(age).append(" ").append(name).append("\n");
        }

        for (int i = 0; i < sb.length; i++) {
            if (!sb[i].toString().isEmpty()) System.out.print(sb[i]);
        }
    }
}


//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        String[][] judgeUser = new String[T][2];
//        for(int i = 0; i < T; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            judgeUser[i][0] = st.nextToken();
//            judgeUser[i][1] = st.nextToken();
//        }
//        Arrays.sort(judgeUser, (o1, o2) -> {
//            return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
//        });
//
//        for(int i = 0 ; i < T; i++){
//            System.out.println(judgeUser[i][0] + " " + judgeUser[i][1]);
//        }
//    }

/*
내가 풀었던 것보다 다른 사람 풀이로 했을 때 메모리가 1/4 가까이 절약됨.
내 알고리즘 -> String[][] 배열 만들어서 각각 나이와 이름 넣고 나이 int로 parsing해서 정렬해줌
다른 사람 알고리즘 -> 카운팅 알고리즘 사용! 나이가 200살까지 입력 가능이므로 201개의 StringBuilder 배열 만들고 각 index에 객체 생성해준 뒤
                 나이와 이름 입력 받을 때 sb배열에서 해당 나이를 index로 설정하여 age와 name을 append 해주었음.
 */