package io.sago.baraja.design.pattern.observer.v1;

public interface Subject {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
