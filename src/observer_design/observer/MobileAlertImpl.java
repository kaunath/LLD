package observer_design.observer;

import observer_design.observable.StockObeservable;

public class MobileAlertImpl implements NotificationAlertObserver {
    String username;
    StockObeservable observable;

    public MobileAlertImpl(String emailid, StockObeservable stockObeservable) {
        this.username = emailid;
        this.observable = stockObeservable;
    }

    public void update() {
        sendMsg(username);
    }
    public void sendMsg(String username) {
        System.out.println("mail sent to " + username);
    }
}
