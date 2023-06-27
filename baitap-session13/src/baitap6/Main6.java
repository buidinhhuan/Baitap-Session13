package baitap6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main6 {

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        //hàm  sắp xếp theo thứ tự giảm dần
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static int binarySearch(Integer[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == target) {
                return mid;
            } else if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy phần tử trong mảng
    }

    public static void main(String[] args) {
        Integer[] newArr = (getArr());
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phần tử cần tìm ");
        int target = sc.nextInt();
        int result = binarySearch(newArr, target);
        if (result != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Không tìm thấy phần tử " + target + " trong mảng");
        }
    }
}

