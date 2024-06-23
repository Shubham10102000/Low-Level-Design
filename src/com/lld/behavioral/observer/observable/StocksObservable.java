package com.lld.behavioral.observer.observable;


import com.lld.behavioral.observer.observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
