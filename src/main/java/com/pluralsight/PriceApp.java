package com.pluralsight;

public class PriceApp {
    public static void main(String[] args) {
int count = 77;
float unitPrice = 8.97f;
float taxRate = 0.825f;
float totalCost;

totalCost = (count * unitPrice) * (1 + taxRate);
        System.out.println(totalCost);
    }
}
