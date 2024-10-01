package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3,9);



    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for (int i = beginning; i < end+1; i++) {
            if(i%3 == 0){
                System.out.println(i);
            }
        }
    }
}
