package observer_design.observer;

import observer_design.observable.StockObeservable;

public class EmailObserverImpl implements NotificationAlertObserver {
    String emailid;
    StockObeservable observable;

    public EmailObserverImpl(String emailid, StockObeservable stockObeservable) {
        this.emailid = emailid;
        this.observable = stockObeservable;
    }

    public void update() {
        sendMail(emailid);
    }
    public void sendMail(String emailid) {
        System.out.println("mail sent to " + emailid);
    }
}
