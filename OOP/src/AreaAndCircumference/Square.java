package AreaAndCircumference;

public class Square {
    private int sisi;

    public Square(int sisi) {
        this.sisi = sisi;
    }

    public int luas() {
        return sisi * sisi;
    }

    public int keliling() {
        return 4 * sisi;
    }
}
