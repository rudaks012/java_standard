package ch09;

public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();
        arrClone[0] = 6;

        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(arrClone));
    }
}
