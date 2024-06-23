package com.lld.behavioral.observer.observable;


import com.lld.behavioral.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {
    private int stockCount = 0;
    private final List<NotificationAlertObserver> observerList = new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) notifySubscribers();
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
