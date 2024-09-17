package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed:" );
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("Greater number is: "+num1);
        }
        else {
            System.out.println("Greater number is: "+num2);
        }




    }
}
