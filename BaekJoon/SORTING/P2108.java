package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2108 {
    private static int[] input;

    public static void main(String[] args) throws IOException {
        input();
        sorting(); //일단 정렬
        average();
        centerNum();
        modeNum();
        scopeNum();
    }

    private static void input() throws IOException {    //양식대로 입력 받아서 전역 변수 배열에 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void average() {     //산술평균 출력
        double average = 0;
        for (int i = 0; i < input.length; i++) {
            average += input[i];
        }
        average /= (double) input.length;
        System.out.println(String.format("%.0f", average));
    }

    private static void centerNum() {    //중앙값 출력
        if (input.length == 1) System.out.println(input[0]);
        else System.out.println(input[input.length / 2]);
    }

    private static void sorting() {
        Arrays.sort(input);
    }

    private static void modeNum() {      //최빈값 출력
        //정렬되어 있으니 count[] 만들어서 천천히 세보자
        int[] count = new int[input.length];
        for (int i = 0; i < input.length - 1; i += count[i]+1) {
            for (int k = i + 1; k < input.length; k++) {
                if (input[i] == input[k]) count[i]++;
                else break;
            }
        }
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                maxIndex = i;
            }

        }

        for (int j = maxIndex + 1; j < count.length; j++) {
            if (max == count[j]) {
                maxIndex = j;
                break;
            }
        }

        System.out.println(input[maxIndex]);
    }

    private static void scopeNum() {     //범위 값 출력
        System.out.println(input[input.length - 1] - input[0]);
    }
}

//input메소드를 따로 만들고싶어서 이번엔 불가피하게 static 변수 선언했음 -> 하면 안됨

/*
산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최대값과 최솟값의 차이

최빈값 출력이 어려웠네
 */