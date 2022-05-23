package CodingTask;

public class Palindrome {

    public static boolean isPalindrome(String str ){
        boolean palindrome = true;

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (reversed.equals(str)) {
            palindrome = true;
        }else{
            palindrome=false;

        }
        return palindrome;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome("dad"));
    }
}



