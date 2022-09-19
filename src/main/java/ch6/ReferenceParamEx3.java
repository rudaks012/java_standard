package ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 6, 5, 4};

        pointArr(arr);
        sortArr(arr);
        pointArr(arr);
        System.out.println("sum=" + sumArr(arr));
    }


    private static void pointArr(int[] arr) {
        System.out.print("[");
//
//        for (int i : arr) {
//            System.out.print(i + ",");
//        }
        Arrays.stream(arr)
              .mapToObj(i -> i + ",")
              .forEach(System.out::print);
        System.out.println("]");
    }

    private static int sumArr(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    private static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
