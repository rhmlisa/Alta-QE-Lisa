package Calculator;

public class Calculator {
    public int addition(int a, int b){

        return a + b;
    }
    public int substraction (int a, int b){

        return a - b;
    }
    public int multiplication(int a, int b){

        return a * b;
    }
    public int division(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Tidak Terdefinisi");
        }
        return a / b;
    }
}
