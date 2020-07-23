import AssignmentSoftwareTesting.Palendromic;

import AssignmentSoftwareTesting.PrimeNumber;
import org.junit.Assert;
import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PalandromicTestCases {
    @BeforeAll
    public void initialize(){
        // PrimeNumber n=new PrimeNumber();
        System.out.println("Testcases for Palendromic() Are Executing");
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
    public void palendromicTestCase1(){
        String str1="aba";
        String str2="cbc";
        Palendromic n=new Palendromic();
        boolean res=true;
        boolean expected=true;
        res=n.checkPalendromic(str1,str2);
        //compares results
        Assert.assertEquals(expected,res);
    }
    @Test
    public void palendromicTestCase2(){
        String str1="abass";
        String str2="cbccc";
        Palendromic n=new Palendromic();
        boolean res=false;
        boolean expected=false;
        res=n.checkPalendromic(str1,str2);
        //compares results
        Assert.assertEquals(expected,res);
    }
    @Test
    public void palendromicTestCase3(){
        String str1="12321";
        String str2="45654";
        Palendromic n=new Palendromic();
        boolean res=true;
        boolean expected=true;
        res=n.checkPalendromic(str1,str2);
        //compares results
        Assert.assertEquals(expected,res);
    }
    @Test
    public void palendromicTestCase(){
        String str1="a";
        String str2="b";
        Palendromic n=new Palendromic();
        boolean res=true;
        boolean expected=true;
        res=n.checkPalendromic(str1,str2);
        //compares results
        Assert.assertEquals(expected,res);
    }
}
