package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:" );
        int end = scanner.nextInt();
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        while (end != -1){
            count++;
            sum += end;
            end = scanner.nextInt();
            if(end%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("Thx!Bye!");
        System.out.println("Your sum: " + sum);
        System.out.println("Count of nums: " + count);
        System.out.println("Your avg:" + avg);
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);




    }
}
