package io.sago.baraja.design.pattern.observer.v1;

public class Main {

    public static void main(String[] args) {
        SoekarnoHatta soekarnoHatta = new SoekarnoHatta();
        KantorBeritaDomai kantorBeritaDomai = new KantorBeritaDomai(soekarnoHatta);
        PemancarDomai pemancarDomai = new PemancarDomai(soekarnoHatta);
        PemudaDaerah pemudaDaerah = new PemudaDaerah(soekarnoHatta);
        ToaMasjid toaMasjid = new ToaMasjid(soekarnoHatta);

        soekarnoHatta.setStatus("Persiapan kemerdekaaan indonesia");

        System.out.println();

        soekarnoHatta.setStatus("Detik detik menjelang proklamasi");

        System.out.println();

        System.out.println("kantorBeritaDomai attacked by japanese troops!");
        soekarnoHatta.removeObserver(kantorBeritaDomai);

        System.out.println();

        soekarnoHatta.setStatus("Proklamasi....");

        System.out.println();

        HarianSoeraRakjat harianSoeraRakjat = new HarianSoeraRakjat(soekarnoHatta);
        System.out.println("harianSoeraRakjat join the broadcast....");
        soekarnoHatta.setStatus("Lanjutkan Perjoeangan");
    }
}
