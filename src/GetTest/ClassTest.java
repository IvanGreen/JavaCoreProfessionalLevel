package GetTest;

public class ClassTest {

    @Test(priority = 5)
    public void testMethod1(){
        System.out.println("Priority = 5");
    }

    @Test(priority = 1)
    public void testMethod2(){
        System.out.println("Priority = 1");
    }

    @Test(priority = 10)
    public void testMethod3(){
        System.out.println("Priority = 10");
    }

    @Test(priority = 7)
    private void testMethod4(){
        System.out.println("Priority = 7 (private)");
    }

    @Test()
    public void testMethod5(){
        System.out.println("Priority defolt (1)");
    }

    @AfterSuite
    public void afterMethod(){
        System.out.println("AfterSuite");
    }

    @BeforeSuite
    public void beforeMethod(){
        System.out.println("BeforeSuite");
    }
}
