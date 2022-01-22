package BRUTE_FORCE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] maker = numberMaker(input);

        for(int i = 0; i < maker.length; i++){
            if(maker[i] == input){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    private static int[] numberMaker(int scope) {
        int[] maker = new int[scope];
        for (int i = 1; i < maker.length; i++) {
            int sum = i;
            int num = i;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            maker[i] = sum;
        }
        return maker;
    }

}

//i에 해당하는 분해합을 배열에 저장하고 배열의 요소를 탐색하면서 N과 값이 같은 요소가 발견되면 그 요소의 index를 출력하면 될 듯?