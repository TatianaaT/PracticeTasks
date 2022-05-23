package Coding;

public class Frequency {


    public static String frequency(String str) {

        String expectedResult = "";
        int j = 0;

        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {

                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");

        }
        return expectedResult;


    }

    public static void main(String[] args) {

        System.out.println(frequency("AAABBCCDD"));
    }



    public  String frequencyOfChar(String str) {

        String result = "";
        int j = 0;
        while (j < str.length()) {

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                } else {

                }
            }
            result += str.charAt(j) + count;
            str = str.replace("" + str.charAt(j), "");

        }

        return result;
    }}

