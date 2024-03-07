package ShippingCost;

public class Cost {
    public float hitungOngkir(int p, int l, int t, float weight) {
        int basePrice = 5000;
        int volume = p * l * t;
        float price;

        if (volume <= 50 && weight <= 1) { //Jika volume barang <=50cm^3 dan berat <= 1kg, maka harga kirim Rp.5000
            price = basePrice;
            return price;
        } else if (volume >= 50 && weight <= 1) { //Jika volume barang >=50cm^3 dan berat <= 1kg, maka harga kirim Rp.5000
            price = basePrice;
            return price;
        } else { //jika volume <= atau >= 50cm^3 dan berat > 1kg, maka harga akan dihitung sesuai dgn perhitungan yang ada
            return basePrice * (volume / 50f) * weight;
        }
    }
}
