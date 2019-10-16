package com.improving;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean loop = true;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What number do you want to convert? \n>");

            int number = scanner.nextInt();

            String romanNumeral = "";


            while (number <= 0 || number > 1000000) {
                System.out.println("Please enter a number between one and a million");
                System.out.print(">");
                number = scanner.nextInt();
            }

            // 5,000 = V̅
            // 10,000 = X̅
            // 50,000 = L̅
            //100,000 = C̅
            //500,000 = D̅
            //1,000,000 = M̅
            while (number >= 1000000) {
                romanNumeral += "M̅";
                number -= 1000000;


            } while (number >= 500000) {
                romanNumeral += "D̅";
                number -= 500000;


            } while (number >= 100000) {
                romanNumeral += " C̅";
                number -= 100000;

            } while (number >= 50000) {
                romanNumeral += "L̅";
                number -= 50000;


            } while (number >= 10000) {
                romanNumeral += "X̅";
                number -= 10000;
            }
            while (number >= 5000) {
                romanNumeral += "V̅";
                number -= 5000;
            }

            while (number >= 1000) {
                romanNumeral += "M";
                number -= 1000;
            }

            while (number >= 900) {
                romanNumeral += "CM";
                number -= 900;
            }

            while (number >= 500) {
                romanNumeral += "D";
                number -= 500;
            }

            while (number >= 400) {
                romanNumeral += "CD";
                number -= 400;
            }

            while (number >= 100) {
                romanNumeral += "C";
                number -= 100;
            }

            while (number >= 90) {
                romanNumeral += "XC";
                number -= 90;
            }

            while (number >= 50) {
                romanNumeral += "L";
                number -= 50;
            }

            while (number >= 40) {
                romanNumeral += "XL";
                number -= 40;
            }

            while (number >= 10) {
                romanNumeral += "X";
                number -= 10;
            }

            while (number >= 9) {
                romanNumeral += "IX";
                number -= 9;
            }

            while (number >= 5) {
                romanNumeral += "V";
                number -= 5;
            }

            while (number >= 4) {
                romanNumeral += "IV";
                number -= 4;
            }

            while (number >= 1) {
                romanNumeral += "I";
                number -= 1;
            }

            System.out.println(romanNumeral);
        }
    }

}

