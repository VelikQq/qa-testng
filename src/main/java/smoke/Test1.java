package smoke;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
   /* @DataProvider(name = "db")
        public static Object[][] dbData () {
        return new Object[][] {
                {"SQL", new Integer(1)},
                {"NoSQL", new Integer(2)}
        };
    }

    @Parameters({"db"})
    @Test (dataProvider = "db")
    public void test1 (String e1, int e2){
        System.out.println("Первый " + " " + e1 + " " + e2 );
    }*/
    //Зависимость
   /*@Test
   public void test1 (){
       System.out.println("Первый ");
   }

    @Test (dependsOnMethods = {"test1"}, alwaysRun = true)
    public void test11 (){
        System.out.println("Тест 11 ");
    }*/
    //Групповой тест
    /*@Test (groups = {"smokeTest", "regress"})
    public void test1 () {
        System.out.println("первый");
    }
    @Test (groups = {"regress"})
    public void test11 () {
        System.out.println("11");
    }
    @Test (groups = {"regress"})
    public void test111 () {
        System.out.println("111");
    }*/
   @Test (retryAnalyzer = Retry.class)
   public void test1 (){
       System.out.println("Первый ");
       Assert.fail();
   }
}
