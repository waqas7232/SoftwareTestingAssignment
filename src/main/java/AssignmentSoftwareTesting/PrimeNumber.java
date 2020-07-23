package AssignmentSoftwareTesting;

public class PrimeNumber implements Prime{
   private int number;


    public Boolean checkPrime(Integer n1) {
        Boolean isPrime=true;
        if(n1<=1){
            return false;
        }
        else{
            for(int i=2;i<n1;i++){
                if(n1%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        return isPrime;
    }
}
