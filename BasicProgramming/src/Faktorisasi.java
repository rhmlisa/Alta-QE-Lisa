public class Faktorisasi {
    public static void main(String[]args){
        int bilangan = 20;
        System.out.println("Faktor bilangan " + bilangan + " adalah");

        for(int i=1;i<=bilangan;i++){
            if(bilangan % i == 0){
                System.out.println(i);
            }
        }
    }
}
