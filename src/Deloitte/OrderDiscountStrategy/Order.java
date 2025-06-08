package Deloitte.OrderDiscountStrategy;

import java.util.function.Function;

class Order {
    double amount;

    Order(double amount) {
        this.amount = amount;
    }

    public void applyDiscount(Function<Double, Double> discountFunc) {
        double discounted = discountFunc.apply(this.amount);
        System.out.println("Final amount after discount: ₹" + discounted);
    }
}


