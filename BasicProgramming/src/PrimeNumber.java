public class PrimeNumber {
    private static boolean primeNumber(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primeNumber(7));
        System.out.println(primeNumber(10));
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
    }

}
