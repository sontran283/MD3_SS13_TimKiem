package Bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random() * 20));
        }
        System.out.println("mang so nguyen hien tai la: " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            int maxNumber = Collections.max(numbers);
            System.out.println("so nguyen lon nhat la:  " + maxNumber);
            return;
        }
    }
}
