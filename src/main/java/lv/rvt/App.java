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
    public static void printTriangle(int size) {
        for (int i = 1; i < size+1; i++) {
            printStars(i);


        }

    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangleTwo(int size) {
        int j = 1;
        for (int i = size; i > 0; i--) {
                printSpaces(i);
                if(j < size+1){
                    printStars(j);
                    j++;
                }



        }
//        for (int i = 1; i < size+1; i++) {
//            printStars(i);
//
//
//        }

    }


    public static void printChristmasTree(int size) {

//        for (int i = 1; i < size*size; i+=2) {
//            printStars(i);
//        }

        int j = 1;
        for (int i = size; i > 0; i--) {
            printSpaces(i);
            if(j < size*size){
                printStars(j);
                j+=2;
            }
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(j/2-1);
            printStars(3);


        }

    }




    public static void main(String[] args) {

//    printStars(5);
//    printStars(5);
//        printSquare(4);
//        printRectangle(17,3);
        printChristmasTree(10);


    }

}
