import AssignmentSoftwareTesting.PrimeNumber;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import AssignmentSoftwareTesting.AverageOfArray;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AverageOfArrayTesting {

    @BeforeAll
    public void initialize(){

        System.out.println("Testcases for AverageOfArray() Are Executing");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("Executing Test Case");

    }
    @AfterEach
    public void afterEach(){
        System.out.println("Executed Successfully");
    }
    @Test
    public void averageOfArrayTestCase1(){
        int[] a={1,2,3,4,5};
        AverageOfArray array=new AverageOfArray(a);

        int res=0;
        int expected=3;
        res=array.CalculateAverage();
        //compares results
        Assert.assertEquals(expected,res);
    }
    @Test
    public void averageOfArrayTestCase2(){
        int[] a={-60,2,50,-4,5};
        AverageOfArray array=new AverageOfArray(a);
        int res=0;
        int expected=-1;
        res=array.CalculateAverage();
        //compares results
        Assert.assertEquals(expected,res);
    }
    @Test
    public void averageOfArrayTestCase3(){
        int[] a={-60};
        AverageOfArray array=new AverageOfArray(a);
        int res=0;
        int expected=-60;
        res=array.CalculateAverage();
        //compares results
        Assert.assertEquals(expected,res);
    }

    @Test
    public void averageOfArrayTestCase4(){
        int[] a={80,60,55,29990,9090,2,-2222,90};
        AverageOfArray array=new AverageOfArray(a);
        int res=0;
        int expected=4643;
        res=array.CalculateAverage();
        //compares results
        Assert.assertEquals(expected,res);
    }

}
