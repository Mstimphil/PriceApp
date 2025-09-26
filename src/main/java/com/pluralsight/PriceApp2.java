package com.pluralsight;

public class PriceApp2 {
    public static void main(String[] args) {
int count = 77;
double unitPrice = 8.97;
double taxRate = 0.825;
double totalCost;
totalCost = (count * unitPrice) * (1+ taxRate);
        System.out.println(totalCost);
    }
}
