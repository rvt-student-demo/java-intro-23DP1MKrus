package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printSquare(int number) {
        for (int i = 0; i < number; i++) {
            printStars(number);


        }

    }
    public static void printRectangle(int width,int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);


        }

    }

    public static void main(String[] args) {

//    printStars(5);
//    printStars(5);
//        printSquare(4);
        printRectangle(17,3);


    }

}
