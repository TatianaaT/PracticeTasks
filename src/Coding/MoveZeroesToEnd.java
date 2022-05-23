package Coding;

import java.util.Arrays;

public class MoveZeroesToEnd {

    public static int[] moveZeroesEnd(int[] arr){

        int[] arr2 =new int[arr.length];
        int countZeros=0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] !=0){
                arr2[i-countZeros]=arr[i];
            }else{
                countZeros++;
            }
        }

        return arr2;
    }

    public static void main(String[] args) {
        int []arr={2,3,0,0,3,0,5,6,0};
        System.out.println(Arrays.toString(moveZeroesEnd(arr)));
    }


    }
