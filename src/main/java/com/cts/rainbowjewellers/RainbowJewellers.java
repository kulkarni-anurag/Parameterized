package com.cts.rainbowjewellers;

import java.util.Scanner;

import com.cts.rainbowjewellers.service.RainbowJewellersService;

public class RainbowJewellers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the gold in grams");
        double grams = Double.parseDouble(scan.nextLine());

        scan.close();

        RainbowJewellersService rainbowJewellersService = new RainbowJewellersService();
        double totalPriceOfGold = rainbowJewellersService.calculategoldprice(grams);

        System.out.println("Total Price of the Gold is: " + totalPriceOfGold);
    }
}
