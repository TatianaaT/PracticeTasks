package Coding;

import java.util.Arrays;

public class AtoZinArray {

    public static void main(String[] args) {

        char [] alphabet= new char[26];

        char ch='Z';

        for (int i = 0; i < alphabet.length; i++) {

            alphabet[i]=ch--;
        }
        System.out.println(Arrays.toString(alphabet));
    }


}