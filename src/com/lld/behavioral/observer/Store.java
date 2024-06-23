package com.lld.behavioral.observer;


import com.lld.behavioral.observer.observable.IphoneObservableImpl;
import com.lld.behavioral.observer.observable.StocksObservable;
import com.lld.behavioral.observer.observer.EmailAlertObserverImpl;
import com.lld.behavioral.observer.observer.MobileAlertObserverImpl;
import com.lld.behavioral.observer.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("paskgandhi@gmail.com",iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("bhavsarkeya@gmal.com",iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("gansh#K3U",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
    }
}
