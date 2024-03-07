package AreaAndCircumference;

public class RightTriangle {
    private int alas;
    private int tinggi;

    public RightTriangle(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double sisiMiring() {
        return Math.sqrt((alas * alas) + (tinggi * tinggi));
    }

    public double keliling() {
        return alas + tinggi + sisiMiring();
    }
}
