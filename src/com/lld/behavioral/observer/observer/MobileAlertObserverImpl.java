package com.lld.behavioral.observer.observer;


import com.lld.behavioral.observer.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    private final String userName;
    private final StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        // send the actual email
        System.out.println("Message sent to:" + userName);
    }
}
