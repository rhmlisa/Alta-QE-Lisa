package Volume;

public class Tabung {
    int jariJari;
    int tinggi;

    public Tabung(int jariJari, int tinggi){
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double volume(){
        return Math.ceil(Math.PI * Math.pow(jariJari, 2) * tinggi);
    }

}
