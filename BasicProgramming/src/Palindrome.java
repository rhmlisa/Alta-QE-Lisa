public class Palindrome {
    private static boolean palindrome(String value){
        value = value.replaceAll("\\s", "");

        int left = 0;
        int right = value.length() -1;
        while (left < right){
            if(value.charAt(left) != value.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
