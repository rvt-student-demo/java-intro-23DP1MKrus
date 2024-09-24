package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:" );
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < end+1; i++) {
                sum = sum + i;
        }
        System.out.println("Your sum: " + sum);



    }
}
