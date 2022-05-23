package Coding;

public class isAnagram {

    public static boolean isAnagram(String word1, String word2){

        if(word2.length() != word2.length()){
            return false;
        }

        for (int i = 0; i < word1.length(); i++) {

            for (int j = 0; j < word2.length(); j++) {

                if(word1.charAt(i) == word2.charAt(j)){
                    word2 = word2.replaceFirst(""+word2.charAt(j), "");
                }
            }
        }
        return word2.trim().isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("JAVA", "VAJA"));

    }
}
