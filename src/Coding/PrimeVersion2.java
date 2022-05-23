package CodingTask;

public class PrimeVersion2{

        public static boolean checkPrime(int n){

            if(n<=1){
                return false;
            }

            for (int i = 2; i < Math.sqrt(n); i++) {
                if(n % 1 ==0 ){
                    return false;
                }
            }
            return true;
        }
}


