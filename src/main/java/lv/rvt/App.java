package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printText("In a hole in the ground there lived a method",7);



    }
    public static void printText(String text,int number){
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }

    }
}
