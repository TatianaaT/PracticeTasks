package CodingTask;

public class OddEvenMethod {

    public static int oddOrEven(int number){

        if(number%2==0 ){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        return number;
    }


    public static void main(String[] args) {

        System.out.println(oddOrEven(5));
    }
}

