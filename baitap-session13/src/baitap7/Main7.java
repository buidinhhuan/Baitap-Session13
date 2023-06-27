package baitap7;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {


    public static void main(String[] args) {
        String[] strArr = {"huan", "nam"};
        System.out.println("nhập vào kí tự cần tìm ");
        Scanner sc = new Scanner(System.in);
        String input =  sc.nextLine();
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(Arrays.toString(strArr));
            if (strArr[i].equals(input)) {
                System.out.println("tìm thấy rồi nha");
                return;
            }
        }
            System.err.println("không thấy nha bé à");
    }
}

