package AreaAndCircumference;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        Rectangular rectangular = new Rectangular(7, 8);

        System.out.println("==Hasil Perhitungan Luas==");
        System.out.println("Luas Persegi: " + square.luas());
        System.out.println("Luas Segitiga: " + rightTriangle.luas());
        System.out.println("Luas Persegi Panjang: " + rectangular.luas());

        System.out.println("\n==Hasil Perhitungan Keliling==");
        System.out.println("Keliling Persegi: " + square.keliling());
        System.out.println("Keliling Segitiga: " + rightTriangle.keliling());
        System.out.println("Keliling Persegi Panjang: " + rectangular.keliling());


    }
}
