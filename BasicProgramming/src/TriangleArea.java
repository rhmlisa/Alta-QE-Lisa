import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter alas : ");
        float alas = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter tinggi : ");
        float tinggi = Float.parseFloat(scanner.nextLine());

        float luas = alas * tinggi / 2;

        System.out.println("luas segitiga adalah : " +luas);
    }
}
