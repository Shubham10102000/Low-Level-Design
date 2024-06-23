package com.lld.behavioral.templateMethod;

public class Client {
    public static void main(String[] args) {
        PaymentFlow paymentFlow1 = new PayToFriend();
        PaymentFlow paymentFlow2 = new PayToMerchant();

        paymentFlow1.sendMoney();
        paymentFlow2.sendMoney();
    }
}
