import java.util.Scanner;

public class DemoTimKiemNhiPhan {
    public static void main(String[] args) {
        int arr[] = {1, 2, 34, 5, 6, 7, 6, 7, 8};
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap vao gia tri de tim kiem");
            int searchNumber = Integer.parseInt(scanner.nextLine());
            int mid;
            int low = 0;
            int high = arr.length - 1;
            boolean isNotFound = true;

            while (low <= high) {
                mid = (low + high) / 2;
                if (arr[mid] == searchNumber) {
                    System.out.printf("phan tu %d can tim nam o vi tri %d ", searchNumber, mid);
                    isNotFound = false;
                    return;
                }

                if (arr[mid] < searchNumber) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (isNotFound) {
                System.out.println("ko tim duoc phan tu");
            }
        }
    }
}
