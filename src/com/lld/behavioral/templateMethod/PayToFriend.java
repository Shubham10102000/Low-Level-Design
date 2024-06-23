package com.lld.behavioral.templateMethod;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validation Logic for PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate Fees Logic for PayToFriend (0%)");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount Logic for PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount Logic for PayToFriend");
    }
}
