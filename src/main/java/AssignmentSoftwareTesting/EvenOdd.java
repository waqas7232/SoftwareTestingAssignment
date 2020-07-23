package AssignmentSoftwareTesting;

public class EvenOdd implements EvenOddInterface{
    private int number;

    public EvenOdd(int number) {
        this.number = number;
    }
    public EvenOdd() {
    }

    public Boolean checkEvenOdd(Integer n1){
        this.number=n1;
        boolean ifEven=true;
        if(number%2==0){
            ifEven=true;
        }
        else{ifEven=false;}
        return ifEven;
    }
}
