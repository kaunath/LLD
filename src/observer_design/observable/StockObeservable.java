package observer_design.observable;

import observer_design.observer.NotificationAlertObserver;

public interface StockObeservable {
    public  void add(NotificationAlertObserver observer);

    public  void remove(NotificationAlertObserver observer);

    public  void notifySubscribers();

    public void setStockAccount(int newStock);

    public  int getStockCount();

}
