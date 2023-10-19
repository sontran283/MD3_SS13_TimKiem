package Bt6;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 56, 7, 8, 9, 10};
        int x = 56;
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("khong tim thay phan tu");
        } else {
            System.out.println("phan tu tai vi tri " + result);
        }
    }

    private static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
