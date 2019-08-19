package io.sago.baraja.design.pattern.observer.v1;

public class HarianSoeraRakjat implements Observer, BroadcastMedia {
    private SoekarnoHatta soekarnoHatta;
    private String statusKemerdekaan = "";

    public HarianSoeraRakjat(SoekarnoHatta soekarnoHatta) {
        this.soekarnoHatta = soekarnoHatta;
        this.soekarnoHatta.addObserver(this);
    }

    @Override
    public void broadcast() {
        System.out.println("HarianSoeraRakjat Menyebarkan buletin spesial:" + statusKemerdekaan);
    }

    @Override
    public void update(String status) {
        this.statusKemerdekaan = status;
        broadcast();
    }
}
