package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed:" );
        int mark = scanner.nextInt();

        if(mark < 0){
            System.out.println("Impossible");

        }else if(mark > 0 && mark < 50){
            System.out.println("failed");
        } else if (mark > 49 && mark < 60) {
            System.out.println("1");
        }else if (mark > 59 && mark < 70) {
            System.out.println("2");
        }else if (mark > 69 && mark < 80) {
            System.out.println("3");
        }else if (mark > 79 && mark < 90) {
            System.out.println("4");
        }else if (mark > 89 && mark < 100) {
            System.out.println("5");
        }



    }
}
