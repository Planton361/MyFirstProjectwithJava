package calculator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //LinkedHashMap<String, Double> prices = initializePrices();
        LinkedHashMap<String, Double> earnings = initializeEarnings();
        //printPriceList(prices);
        double income = printEarnedAmount(earnings);
        printNetincome(scanner, income);
    }

    private static void printNetincome(Scanner scanner, double income) {
        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();
        double netIncome = income - staffExpenses - otherExpenses;
        System.out.println("Net income: $" + netIncome);

    }


    private static LinkedHashMap<String, Double> initializeEarnings() {
        LinkedHashMap<String, Double> earnings = new LinkedHashMap<>();
        earnings.put("Bubblegum: $", 202.);
        earnings.put("Toffee: $", 118.);
        earnings.put("Ice cream: $", 2250.);
        earnings.put("Milk chocolate: $", 1680.);
        earnings.put("Doughnut: $", 1075.);
        earnings.put("Pancake: $", 80.);
        return earnings;
    }

    private static LinkedHashMap<String, Double> initializePrices() {
        LinkedHashMap<String, Double> prices = new LinkedHashMap<>();
        prices.put("Bubblegum: $", 2.);
        prices.put("Toffee: $", 0.2);
        prices.put("Ice cream: $", 5.);
        prices.put("Milk chocolate: $", 4.);
        prices.put("Doughnut: $", 2.5);
        prices.put("Pancake: $", 3.2);
        return prices;
    }

    private static void printPriceList(LinkedHashMap<String, Double> prices) {
        System.out.println("Prices:");
        for (String name : prices.keySet()) {
            System.out.println(name + prices.get(name));
        }
    }

    private static double printEarnedAmount(LinkedHashMap<String, Double> earnings) {
        double income = 0;
        System.out.println("Earned amount:");
        for (String name : earnings.keySet()) {
            System.out.println(name + earnings.get(name));
            income += earnings.get(name);
        }
        System.out.println();
        System.out.println("Income: $" + income);
        return income;
    }

}