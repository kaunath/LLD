package observer_design;

import observer_design.observable.IphoneObservableImplementation;
import observer_design.observable.StockObeservable;
import observer_design.observer.EmailObserverImpl;
import observer_design.observer.MobileAlertImpl;
import observer_design.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObeservable iphone = new IphoneObservableImplementation();

        NotificationAlertObserver observer1 = new EmailObserverImpl("xyz@gmail.com", iphone);
        NotificationAlertObserver observer2 = new EmailObserverImpl("abc@gmail.com", iphone);
        NotificationAlertObserver observer3 = new MobileAlertImpl("xyz", iphone);

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);

        iphone.setStockAccount(10);
    }
}
