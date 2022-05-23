package Coding;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)) {
                    str2 = str2.replaceFirst("" + str2.charAt(j), " ");
                }


            }

        }

        return str2.trim().isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
    }

}
