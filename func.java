package com.company;

import java.util.Scanner;

class and {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        String LED_on = "\nled on";
        String LED_off = "\nled off";
        int IF1;
        System.out.print("\nIF1: ");
        IF1 = input.nextInt();
        int IF2;
        System.out.print("IF2: ");
        IF2 = input.nextInt();
        if (IF1 == 1 && IF2 == 1) {
            System.out.print("\n" + LED_on + "\n");
        } else {
            System.out.print("\n" + LED_off + "\n");
        }
    }
}

class or {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        String LED_on = "\nled on";
        String LED_off = "\nled off";
        int IF1;
        System.out.print("\nIF1: ");
        IF1 = input.nextInt();
        int IF2;
        System.out.print("IF2: ");
        IF2 = input.nextInt();
        if (IF1 == 1 || IF2 == 1) {
            System.out.print(LED_on);
        } else if (IF1 == 0 || IF2 == 0) {
            System.out.print("\n" + LED_off + "\n");
        } else {
            System.out.print("\n" + LED_off + "\n");
        }
    }
}

class not {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        String LED_on = "\nled on";
        String LED_off = "\nled off";
        int IF1;
        System.out.print("\nIF1: ");
        IF1 = input.nextInt();
        if (IF1 == 1) {
            System.out.print("\n" + LED_off + "\n");
        } else if (IF1 == 0) {
            System.out.print("\n" + LED_on + "\n");
        }
    }
}

public class index_run {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        do {
            int choose;
            System.out.print("\n\n1.and / 2.or / 3.not: ");
            choose = input.nextInt();
            if (choose == 1) {
                and.StaticMethod();
            } else if (choose == 2) {
                or.StaticMethod();
            } else if (choose == 3) {
                not.StaticMethod();
            } else {
                System.exit(1);
            }
        } while (true);
    }
}
