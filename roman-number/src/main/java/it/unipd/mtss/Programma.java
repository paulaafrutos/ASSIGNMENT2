////////////////////////////////////////////////////////////////////
// Paula Frutos Romo 2099339
// German Gil Planes 2099465
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
        System.out.println("Write a number. Press 'q' to exit.");
        String str = scanner.nextLine();
            if (str.equalsIgnoreCase("q")) {
            System.out.println("Ending...");
            exit = true;
            }
            else {
            int num = Integer.parseInt(str);
            RomanPrinter.print(num);
            System.out.println();
            }
        }
        scanner.close();
    }
}
