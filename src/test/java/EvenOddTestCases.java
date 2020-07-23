import AssignmentSoftwareTesting.EvenOdd;

import AssignmentSoftwareTesting.PrimeNumber;
import org.junit.Assert;
import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class EvenOddTestCases {
    @BeforeAll
    public void initialize(){
        System.out.println("Testcases for EvenOdd() Are Executing");
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
    public void evenOddTc1(){
        int num=105;
        EvenOdd obj=new EvenOdd();
        boolean res=false;
        boolean expected=false;
        res=obj.checkEvenOdd(num);
        //compares results
        Assert.assertEquals(expected,res);
    }
    @Test
    public void evenOddTc2(){
        int num=2;
        EvenOdd obj=new EvenOdd();
        boolean res=false;
        boolean expected=true;
        res=obj.checkEvenOdd(num);
        //compares results
        Assert.assertEquals(expected,res);
    }

    @Test
    public void evenOddTc3(){
        int num=0;
        EvenOdd obj=new EvenOdd();
        boolean res=false;
        boolean expected=true;
        res=obj.checkEvenOdd(num);
        //compares results
        Assert.assertEquals(expected,res);
    }

    @Test
    public void evenOddTc4(){
        int num=-2;
        EvenOdd obj=new EvenOdd();
        boolean res=false;
        boolean expected=true;
        res=obj.checkEvenOdd(num);
        //compares results
        Assert.assertEquals(expected,res);
    }

    @Test
    public void evenOddTc5(){
        int num=-255;
        EvenOdd obj=new EvenOdd();
        boolean res=false;
        boolean expected=false;
        res=obj.checkEvenOdd(num);
        //compares results
        Assert.assertEquals(expected,res);
    }

}
