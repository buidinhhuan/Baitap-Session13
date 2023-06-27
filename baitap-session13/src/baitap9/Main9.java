package baitap9;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị nhỏ nhất");
        int min = sc.nextInt();// Giá trị nhỏ nhất
        System.out.println("nhập giá trị lớn nhất");
        int max = sc.nextInt(); // Giá trị lớn nhất
        int closestMin = findClosestValue(arr, min);
        int closestMax = findClosestValue(arr, max);

        System.out.println("Giá trị gần nhất với min: " + closestMin);
        System.out.println("Giá trị gần nhất với max: " + closestMax);
    }

    private static int findClosestValue(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Nếu không tìm thấy giá trị chính xác, trả về giá trị gần nhất
        if (left >= arr.length) {
            return arr[right];
        } else if (right < 0) {
            return arr[left];
        } else {
            int diffLeft = Math.abs(arr[left] - target);
            int diffRight = Math.abs(arr[right] - target);
            if (diffLeft <= diffRight) {
                return arr[left];
            } else {
                return arr[right];
            }
        }
    }
}