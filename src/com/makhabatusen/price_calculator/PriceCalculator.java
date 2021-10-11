package com.makhabatusen.price_calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class PriceCalculator {

    ArrayList<Price> priceList = new ArrayList<>();
    Price price = new Price();
    Scanner scanner = new Scanner(System.in);


    public void startCalculations() {

        priceList.add(inputFromUser());

        System.out.printf("\ntotal price: %.2f\n", calculateTheTotalPrice(price));
    }

    private double calculateTheTotalPrice(Price price) {
        if (getDiscounts() > 0)
            return price.getPrice() * price.getDays() * getSeasonPrice() * getDiscounts();
        else return price.getPrice() * price.getDays() * getSeasonPrice();

    }

    private Price inputFromUser() {
        System.out.println("Please type the price: ");
        price.setPrice(scanner.nextDouble());

        System.out.println("Please type the duration of your stay: ");
        price.setDays(scanner.nextInt());

        StringBuilder seasonOptions = new StringBuilder("\nPlease select the Season:");
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            seasonOptions.append("\n").append(season);
        }
        System.out.println(seasonOptions);
        price.setSeason(scanner.next().trim());

        StringBuilder discountOptions = new StringBuilder("\nPlease select the Discount Options:");
        Discounts[] discounts = Discounts.values();
        for (Discounts discount : discounts) {
            discountOptions.append("\n").append(discount);
        }
        System.out.println(discountOptions);
        System.out.println("bla bla bla");

        price.setDiscounts(scanner.next().trim());

        return price;

    }

    private double getDiscounts() {
        if (price.getDiscounts().equalsIgnoreCase(Discounts.VIP.name()))
           return 0.8;
        else if (price.getDiscounts().equalsIgnoreCase(Discounts.SECOND_VISIT.name()))
            return  0.9;
        else  return  0;
    }

    private int getSeasonPrice() {
        if (price.getSeason().equalsIgnoreCase(Season.AUTUMN.name()))
            return 1;
        else if (price.getSeason().equalsIgnoreCase(Season.SPRING.name())) {
           return  2;
        } else if (price.getSeason().equalsIgnoreCase(Season.WINTER.name())) {
            return  3;
        } else return 4;

    }




}
