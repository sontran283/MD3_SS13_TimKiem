import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoTimKiemTuyenTinh {
    public static void main(String[] args) {
        int arr[] = {1, 2, 34, 5, 6, 7, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 so de tim kiem");
        int searchNumber = Integer.parseInt(scanner.nextLine());
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