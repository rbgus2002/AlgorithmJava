package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        int[][] location = new int[repeat][2];

        for(int i = 0; i < repeat; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            location[i][0] = Integer.parseInt(st.nextToken());
            location[i][1] = Integer.parseInt(st.nextToken());
        }
        locationSorting(location);
    }

    private static void locationSorting(int[][] location){
        Arrays.sort(location, (o1, o2) -> {
            if(o1[1] != o2[1]) return Integer.compare(o1[1], o2[1]);
            else return Integer.compare(o1[0], o2[0]);
        });

        for(int i =0 ; i < location.length; i++){
            for(int j = 0 ; j < 2; j++){
                System.out.print(location[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//compare안쓰고도 quick sort로도 풀 수 있다고 함