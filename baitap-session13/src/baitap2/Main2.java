package baitap2;

import java.util.Arrays;

public class Main2 {
    private static  int[] getArr(){
        int arr[]= new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random() *100);
        }
            System.out.println("mảng ngẫu nhiên ban đầu là " +  Arrays.toString(arr));
        return  arr;

    }
    public static void main(String[] args) {
        int[] boxArr = getArr();

        int min = boxArr[0];
        for (int i = 0; i < boxArr.length; i++) {
            if (boxArr[i] < min ){
                min = boxArr[i];
            }
        }
        System.out.println("phần tử nhỏ nhất  trong mảng ngẫu nhiên là " +  min);
    }
}
