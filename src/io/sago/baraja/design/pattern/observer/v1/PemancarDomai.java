package io.sago.baraja.design.pattern.observer.v1;

public class PemancarDomai implements Observer, BroadcastMedia {
    private SoekarnoHatta soekarnoHatta;
    private String statusKemerdekaan = "";

    public PemancarDomai(SoekarnoHatta soekarnoHatta) {
        this.soekarnoHatta = soekarnoHatta;
        this.soekarnoHatta.addObserver(this);
    }

    @Override
    public void update(String status) {
        this.statusKemerdekaan = status;
        broadcast();
    }

    @Override
    public void broadcast() {
        System.out.println("PemancarDomai Menyiarkan melalui radio: " + statusKemerdekaan);
    }
}
