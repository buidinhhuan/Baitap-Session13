package baitap3;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print( arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        return arr;
    }


    public static void main(String[] args) {

        int[][] newArr = getArr();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vj trí cần tìm");
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                if (newArr[i][j] == target) {
                    System.out.println(" phần tử " + target + "được tìm thấy " + i + " và " + j);
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            System.out.println("không tìm thấy vị trí " + target);
        }
    }

}