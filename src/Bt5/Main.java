package Bt5;

public class Main {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 34, 4, 5, 5};
        int key = 4;
        System.out.println(key + " duoc tim thay o vi tri thu " + linearSearch(a1, key));
    }

    private static int linearSearch(int[] a1, int key) {
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
