package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] location = new int[num];
        int[] copyLocation = new int[num];
        for (int i = 0; i < num; i++) {
            location[i] = Integer.parseInt(st.nextToken());
            copyLocation[i] = location[i];
        }
        Arrays.sort(copyLocation);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for(int i = 0; i < copyLocation.length; i++){
            if(!map.containsKey(copyLocation[i])) map.put(copyLocation[i], rank++);
        }
        //각 숫자에 대응되는 Map 만들어줬음
        StringBuilder sb = new StringBuilder();
        for(int i : location){
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
