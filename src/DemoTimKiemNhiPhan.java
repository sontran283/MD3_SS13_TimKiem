import java.util.Scanner;

public class DemoTimKiemNhiPhan {
    // la hoat dong tim kiem tren mang, danh sach da sap xep
    // tim kiem mot phan tu bang cach so sanh gia tri cua phan tu o giua nhat cua tap du lieu
    // neu trung khop thi chi mua index cua phan tu duoc tra ve
    // neu phan tu can tim lon hon gia tri phan tu giua, thi phan tu can tim phai nam trong nua mang con ben canh
    // neu khong thi no nam o nua mang ben trai
    // tien trinh se tiep tuc nhu vay, cho den khi tim thay phan tu, hoac ko the chia nho duoc nua
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
