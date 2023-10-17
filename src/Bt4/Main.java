package Bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bài tập tìm kiếm tuyến tính trong mảng số nguyên
        // Đề bài: Viết chương trình tìm kiếm tuyến tính trong mảng số nguyên, nhập mảng và giá trị cần tìm từ bàn phím
        // In ra vị trí của giá trị cần tìm nếu nó có trong mảng, ngược lại in ra thông báo không tìm thấy
        // B1 tạo mảng cho sẵn phần tử
        // B2: lấy số cần tìm từ scanner
        // B3: tìm số lớn nhất trong mảng và in ra

        int arr[] = {1, 2, 3, 5, 7, 8, 9, 10, 11, 13, 18};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mot so can tim kiem: ");
        int searchNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                System.out.printf("phan tu %d can tim nam o vi tri %d ", searchNumber, i);
                return;
            }
        }
        System.out.println("khong tim kiem duoc");
    }
}
