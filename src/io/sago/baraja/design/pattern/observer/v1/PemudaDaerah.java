package io.sago.baraja.design.pattern.observer.v1;

public class PemudaDaerah implements Observer, BroadcastMedia {
    private SoekarnoHatta soekarnoHatta;
    private String statusKemerdekaan = "";

    public PemudaDaerah(SoekarnoHatta soekarnoHatta) {
        this.soekarnoHatta = soekarnoHatta;
        this.soekarnoHatta.addObserver(this);
    }

    @Override
    public void broadcast() {
        System.out.println("PemudaDaerah Menyebarkan menggunakan bahasa daerah: " + statusKemerdekaan);
    }

    @Override
    public void update(String status) {
        this.statusKemerdekaan = status;
        broadcast();
    }
}
