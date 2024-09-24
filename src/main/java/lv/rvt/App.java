package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:" );
        int num = scanner.nextInt();
        int sum = 0;
        while(num != 0){
            sum = num +sum;
            System.out.println("Enter number or 0 to end the program:" );
            num = scanner.nextInt();
        }
        System.out.println("Your sum is: " + sum);
    }
}
