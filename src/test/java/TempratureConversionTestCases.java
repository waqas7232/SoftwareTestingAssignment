import AssignmentSoftwareTesting.PrimeNumber;
import AssignmentSoftwareTesting.TempratureConversion;
import org.junit.Assert;
import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TempratureConversionTestCases {
    @BeforeAll
    public void start(){
        System.out.println("Testcases for TempratureConversion() Are Executing");
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
    public void tempratureTestCase1(){
        double celcius=35.5;
        TempratureConversion temp=new TempratureConversion();

        double[] expected={308.65,95.9};
        double[] res=temp.calculate(celcius);

        //compares results
        //delta is a window in which the difference can occure
        Assert.assertArrayEquals(expected,res,0.3);
    }

@Test
    public void tempratureTestCase2(){
        double celcius=0;
        TempratureConversion temp=new TempratureConversion();

        double[] expected={273.15,32};
        double[] res=temp.calculate(celcius);
        //delta is a window in which the difference can occure
        Assert.assertArrayEquals(expected,res,1);
    }

    @Test
    public void tempratureTestCase3(){
        double celcius=-100;
        TempratureConversion temp=new TempratureConversion();

        double[] expected={173.15,-148};
        double[] res=temp.calculate(celcius);
        //delta is a window in which the difference can occure
        Assert.assertArrayEquals(expected,res,1);
    }
    @Test
    public void tempratureTestCase4(){
        double celcius=10.9;
        TempratureConversion temp=new TempratureConversion();

        double[] expected={284.05,51.62};
        double[] res=temp.calculate(celcius);
        //delta is a window in which the difference can occure
        Assert.assertArrayEquals(expected,res,1);
    }



}
