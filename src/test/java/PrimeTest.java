import AssignmentSoftwareTesting.Prime;
import AssignmentSoftwareTesting.PrimeNumber;

import org.junit.Assert;
import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PrimeTest {
    @BeforeAll
    public void initialize(){
       // PrimeNumber n=new PrimeNumber();
        System.out.println("Testcases for PrimeNumber() Are Executing");
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
    public void primeTestCase1(){
        int num=5;
        PrimeNumber n=new PrimeNumber();
        boolean res=true;
        boolean expected=true;
        res=n.checkPrime(num);
        //compares results
        Assert.assertEquals(expected,res);
    }
    @Test
    public void primeTestCase2(){
        int num=0;
        PrimeNumber n=new PrimeNumber();
        boolean res=true;
        boolean expected=false;
        res=n.checkPrime(num);
        //compares results
        Assert.assertEquals(expected,res);
    }

    @Test
    public void primeTestCase3(){
        int num=-3;
        PrimeNumber n=new PrimeNumber();
        boolean res=true;
        boolean expected=false;
        res=n.checkPrime(num);
        //compares results
        Assert.assertEquals(expected,res);
    }
    @Test
    public void primeTestCase4(){
        int num=100000;
        PrimeNumber n=new PrimeNumber();
        boolean res=true;
        boolean expected=false;
        res=n.checkPrime(num);
        //compares results
        Assert.assertEquals(expected,res);

    }
    @Test
    public void primeTestCase5(){
        int num=-100003;
        PrimeNumber n=new PrimeNumber();
        boolean res=true;
        boolean expected=false;
        res=n.checkPrime(num);
        //compares results
        Assert.assertEquals(expected,res);

    }


    @Test
    public void primeTestCase6(){
        int num=100003;
        PrimeNumber n=new PrimeNumber();
        boolean res=true;
        boolean expected=true;
        res=n.checkPrime(num);
        //compares results
        Assert.assertEquals(expected,res);

    }

}
