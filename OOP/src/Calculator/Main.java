package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("===Kalkulator Sederhana===");
        System.out.println("Hasil 3  + 4  = " +calculator.addition(3, 4));
        System.out.println("Hasil 15 - 4  = " +calculator.substraction(15, 4));
        System.out.println("Hasil 10 * 10 = " +calculator.multiplication (10, 10));
        System.out.println("Hasil 12 / 3  = " +calculator.division (12, 3));

    }
}
