package com.franlops.TestingJUnit.discounts;

public class PriceCalculator {

    double total = 0;
    int discount = 0;

    public double getTotal() {
        if (this.discount > 0){
            this.total *= (double)this.discount / 100;
        }
        return this.total;
    }

    public void addPrice(double price) {
        this.total += price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
