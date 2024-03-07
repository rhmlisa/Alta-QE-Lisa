package Volume;

public class Main {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(10);
        Balok balok = new Balok(3,6,10);
        Tabung tabung = new Tabung(7,10);

        System.out.println("Hasil Perhitungan Volume");
        System.out.println("Volume Kubus : " + kubus.volume());
        System.out.println("Volume Balok : " + balok.volume());
        System.out.println("Volume Tabung : " + tabung.volume());

    }

}
