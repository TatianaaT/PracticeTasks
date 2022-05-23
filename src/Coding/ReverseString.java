package Coding;

public class ReverseString {

    public static String reverse(String str){

        int length=str.length();
        String reverseStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr += ""+str.charAt(i);

        }
        return reverseStr;
    }


    public static void main(String[] args) {

        System.out.println(reverse("Java"));
    }
}

