package com.lld.behavioral.observer.observer;

import com.lld.behavioral.observer.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    private final String emailId;
    private final StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in stock hurry up!");
    }

    private void sendEmail(String emailId, String msg) {
        // send the actual email
        System.out.println("Mail sent to:" + emailId);
    }
}
