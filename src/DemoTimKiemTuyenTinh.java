import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoTimKiemTuyenTinh {
    // la hoat dong tim kiem tuan tu qua cac phan tu, moi phan tu deu duoc kiem ta,
    // neu tim thay trung khop thi phan tu do se tra ve,
    // neu ko thay thi tiep tuc duyet vong lap cho den het
    //
    public static void main(String[] args) {
        int arr[] = {1, 2, 34, 5, 6, 7, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 so de tim kiem");
        int searchNumber = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                System.out.printf("phan tu %d can tim nam o vi tri %d ", searchNumber, i);
                return;
            }
        }
        System.out.println("khong tim kiem duoc");

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "le a", true));
        students.add(new Student(2, "le b", true));
        students.add(new Student(3, "le c", true));
        boolean isNotFound = true;

        System.out.println("nhap tu khoa tim kiem sv ");
        String keyWord = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().contains(keyWord)) {
                System.out.println(student);
                isNotFound = false;
            }
        }
        if (isNotFound) {
            System.out.println("ko tim thay");
        }
    }
}