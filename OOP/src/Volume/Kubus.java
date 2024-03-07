package Volume;

public class Kubus {
    int sisi;

    public Kubus(int sisi){
        this.sisi = sisi;
    }

    public int volume(){
        return sisi * sisi * sisi;
    }
}
