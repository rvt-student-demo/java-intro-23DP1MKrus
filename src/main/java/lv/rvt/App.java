package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printUntilNumber(7);



    }
    public static void printUntilNumber(int number){
        for (int i = 1; i < number+1; i++) {
            System.out.println(i);
        }

    }
}
