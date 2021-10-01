package com.makhabatusen;

import com.makhabatusen.price_calculator.PriceCalculator;
import com.makhabatusen.university.UniversitySystem;

public class Main {

    public static void main(String[] args) {

        System.out.println("First Task: Price Calculator\n");

        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.startCalculations();


        System.out.println("\nSecond Task: University Database\n");

        // #2 University System for adding Students info to DataBase
        UniversitySystem uniSystem = new UniversitySystem();
        while (true)
            uniSystem.startProgram();
    }
}
