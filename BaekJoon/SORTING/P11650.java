package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P11650 {
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
            if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
            else return Integer.compare(o1[0], o2[0]);
        });

        for(int i = 0; i < location.length; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(location[i][j] + " ");
            }
            System.out.println();
        }

    }
}
