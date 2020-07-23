package AssignmentSoftwareTesting;

public class AverageOfArray {
    int[] a;

    public AverageOfArray(int[] a) {
        this.a = a;
    }
    public int CalculateAverage(){
        int sum = 0;
        for (int value : this.a) {
            sum += value;
        }
        return sum/a.length;


    }
}
