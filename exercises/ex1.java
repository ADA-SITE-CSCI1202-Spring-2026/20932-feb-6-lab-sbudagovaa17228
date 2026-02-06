package exercises;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;
        System.out.println(hours + " h " + minutes + " m " + seconds + " s ");
    }
}

