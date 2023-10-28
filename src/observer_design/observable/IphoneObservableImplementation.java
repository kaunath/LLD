package observer_design.observable;

import observer_design.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImplementation implements StockObeservable {
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public  int stockCount = 0;

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
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockAccount(int newStock) {

        stockCount = stockCount + newStock;
        if(stockCount != 0) {
            notifySubscribers();
        }

    }
    @Override
    public int getStockCount() {
        return stockCount;
    }
}
