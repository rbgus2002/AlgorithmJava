package Array;

public class ArrayReverseCopy {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {1, 42, 45, 77, 2};
        rcopy(a, b);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    private static void rcopy(int[] a, int[] b){
        for(int i = 0 ; i < b.length; i++){
            a[i] = b[b.length - (i+1)];
        }
    }
}
