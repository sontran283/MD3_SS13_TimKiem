package Bt3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();

    public static void main(String[] args) {
        //    B2: trong hàm tạo 1 mảng 2 chiều và gọi hàm getArr() để gán.
        int arr[][] = getArr();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("nhap so can tim kiem: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (check(number, arr)) {
            System.out.printf("cac vi tri xuat hien %d la \n", number);
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    System.out.printf("(%d, %d); ", list1.get(j) + 1, list2.get(j) + 1);
                }
            }
        }
    }

    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    // B1: tạo 1 hàm tìm kiếm có kdl trả về là Boolean
    public static boolean check(int number, int[][] arr) {
        //    B3: tạo 2 List có kiểu dữ liệu là int để lưu những vị trí số đó xuất hiện.
        //    B4: tạo biến check dkl bolean, mặc định = false
        boolean checkTest = false;
        //    B5: sử dụng vòng lặp lồng nhau duyệt qua tất cả phần tử của mảng 2 chiều,
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // nếu có phần tử trùng ta sẽ add vị trí vào 2 list ở trên và đổi biết check = true.
                if (number == arr[i][j]) {
                    list1.add(i);
                    list2.add(j);
                    checkTest = true;
                }
            }
        }
        return checkTest;
    }
}
