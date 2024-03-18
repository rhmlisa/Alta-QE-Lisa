import java.util.Scanner;

public class CobaHitungTotalHarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah item: ");
        String itemTotalText = scanner.nextLine();
        System.out.print("Masukkan nilai pajak: ");
        String taxText = scanner.nextLine();
        System.out.print("Masukkan total harga: ");
        String priceTotalText = scanner.nextLine();

        if (validateInput(itemTotalText) && validateInput(taxText) && validateInput(priceTotalText)) {
            boolean result = calculateAndCompareTotalValues(itemTotalText, taxText, priceTotalText);
            System.out.println("Hasil perhitungan: " + (result ? "Sama" : "Tidak Sama"));
        } else {
            System.out.println("Input tidak valid. Harap masukkan angka yang valid.");
        }

        scanner.close();
    }

    private static boolean validateInput(String input) {
        return input.matches("[0-9.]+");
    }

    private static boolean calculateAndCompareTotalValues(String itemTotalText, String taxText, String priceTotalText) {
        try {
            double itemTotalValue = Double.parseDouble(itemTotalText);
            double taxValue = Double.parseDouble(taxText);
            double priceTotalValue = Double.parseDouble(priceTotalText);

            double calculatedTotal = itemTotalValue + taxValue;

            return Double.compare(calculatedTotal, priceTotalValue) == 0;
        } catch (NumberFormatException e) {
            System.err.println("Error parsing numeric values: " + e.getMessage());
            return false;
        }
    }
}
