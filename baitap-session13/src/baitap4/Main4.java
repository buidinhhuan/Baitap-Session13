package baitap4;

import java.util.Scanner;

public class Main4 {
    public static int binarySearch(int[] arr, int target) {
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
        int[] array = {2, 4, 7, 10, 13, 15, 18};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phần tử cần tìm ");
        int target = sc.nextInt();
        int result = binarySearch(array, target);
        if (result != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Không tìm thấy phần tử " + target + " trong mảng");
        }
    }
}
