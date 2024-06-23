package com.lld.behavioral.templateMethod;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validation Logic for PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate Fees Logic for PayToMerchant (2%)");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount Logic for PayToMerchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount Logic for PayToMerchant");
    }
}
