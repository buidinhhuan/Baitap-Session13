package baitap8;

import java.sql.SQLOutput;
import java.util.*;

public class Main8 {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
        /** Copyright belong to Rikkei Academy*/
    }

    public static void main(String[] args) {

        int[] newArr = getArr();
        ArrayList<Integer> listNumber = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập min ");
        int min = sc.nextInt();
        listNumber.add(min);
        System.out.println("nhập max ");
        int max = sc.nextInt();
        listNumber.add(max);
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > min && newArr[i] < max) {
                listNumber.add(newArr[i]);
                break;
            }
        }
        System.out.println(Arrays.toString(listNumber.toArray()));
        //Arrays.sort(listNumber, Collections.reverseOrder());
        listNumber.sort((a, b) -> b.compareTo(a));
        System.out.println(listNumber);
    }

}
