package GetTest;

public class MainClass {
    public static void main(String[] args) {

        ClassTest classTest = new ClassTest();
        TestHandler.start(classTest.getClass());
    }
}
