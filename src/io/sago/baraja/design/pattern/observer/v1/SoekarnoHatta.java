package io.sago.baraja.design.pattern.observer.v1;

import java.util.ArrayList;
import java.util.List;

public class SoekarnoHatta implements Subject {
    private List<Observer> observers;
    private String statusKemerdekaan;

    public SoekarnoHatta() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }

    }

    @Override
    public void notifyObserver() {
        for (Observer o :
                this.observers) {
            o.update(this.statusKemerdekaan);
        }
    }

    void setStatus(String status) {
        this.statusKemerdekaan = status;
        System.out.println("Sokarno-Hatta update: " + status);
        onStatusUpdated();
    }

    private void onStatusUpdated() {
        notifyObserver();
    }
}
