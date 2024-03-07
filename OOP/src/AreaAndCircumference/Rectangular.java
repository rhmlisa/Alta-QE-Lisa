package AreaAndCircumference;

public class Rectangular {
    private int panjang;
    private int lebar;

    public Rectangular(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luas() {
        return panjang * lebar;
    }

    public int keliling() {
        return 2 * (panjang + lebar);
    }
}
