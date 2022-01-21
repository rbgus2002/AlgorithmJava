package FUNCTION;

public class P4673 {
    public static void main(String[] args) {
        int[] notSelfNum = new int[20000];
        for (int i = 0; i < 10000; i++) {
            notSelfNum[dn(i)]++;
        }
        for (int i = 0; i < 10000; i++) {
            if(notSelfNum[i] == 0) System.out.println(i);
        }
    }

    private static int dn(int num) {
        int sum = num;
        String number = String.valueOf(num);

        for(int i = 0; i < number.length(); i++){
            sum += number.charAt(i) - '0';
        }
        return sum;
    }
}
