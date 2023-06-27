package baitap1;

import java.util.Arrays;

public class Main1 {
    private static  int[] getArr(){
        int arr[]= new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random() *100);

        }
        System.out.println(" mảng ngẫu nhiên ban đầu là " +  Arrays.toString(arr));
        return  arr;

    }
    public static void main(String[] args) {
       int[] boxArr = getArr();

            int max = boxArr[0];
        for (int i = 0; i < boxArr.length; i++) {
            if (boxArr[i] > max ){
                max = boxArr[i];
            }
        }
        System.out.println("phần tử lớn nhất trong mảng ngẫu nhiên là " +  max);
    }
}
