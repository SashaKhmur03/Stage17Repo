package by.itstep.sasha.dz17.controller;

import java.util.Scanner;

import static by.itstep.sasha.dz17.model.logic.FootballManager.reverseNumber;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a four-digit number or more ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        System.out.println("reverse number " + reversedNumber);

    }
}
