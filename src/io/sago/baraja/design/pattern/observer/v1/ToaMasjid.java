package io.sago.baraja.design.pattern.observer.v1;

public class ToaMasjid implements Observer, BroadcastMedia {
    private SoekarnoHatta soekarnoHatta;
    private String statusKemerdekaan = "";

    public ToaMasjid(SoekarnoHatta soekarnoHatta) {
        this.soekarnoHatta = soekarnoHatta;
        this.soekarnoHatta.addObserver(this);
    }

    @Override
    public void broadcast() {
        System.out.println("ToaMasjid Mengumumkan dengan Toa:" + statusKemerdekaan);
    }

    @Override
    public void update(String status) {
        this.statusKemerdekaan = status;
        broadcast();
    }
}
