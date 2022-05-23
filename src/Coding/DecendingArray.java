package CodingTask;
import java.util.Arrays;

public class DecendingArray {

    public static void main(String[] args) {

        int []numbers  ={10,20,30,40};//40,30,20/10
        //  0  1  2   3
        int reversed[]=new int[numbers.length];
        //        j          i
      /* reversed[0]=numbers[3];
        reversed[1]=numbers[2];
        reversed[2]=numbers[1];
        reversed[3]=numbers[0];*/

        Arrays.sort(numbers);

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reversed));
    }


}
