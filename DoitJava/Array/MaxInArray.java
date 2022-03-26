package Array;

import java.util.Random;

public class MaxInArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[10];

        for(int i = 0; i < 10; i++){
            num[i] = random.nextInt(90);
        }
        System.out.println(maxFindInArray(num));
    }

    private static int maxFindInArray(int[] num){
        int max = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] > max)
                max = num[i];
        }
        return max;
    }
}
