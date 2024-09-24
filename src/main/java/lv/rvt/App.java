package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:" );
        int start = scanner.nextInt();
        for (int i = start; i < 101; i++) {
            System.out.println(i);
        }



    }
}
