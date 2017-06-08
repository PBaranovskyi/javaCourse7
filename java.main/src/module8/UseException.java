package module8;

/**
 * Created by citsym on 08.06.17.
 */
public class UseException {
    public static void main(String[] args) {

        System.out.println("1 line");

        try {
            methodWithException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("2 line");
        System.out.println("3 line");


    }

    private static void methodWithException() throws MyException {

        method2();
        throw new MyException("My exception");

    }

    private static void method2() throws MyException {
        throw new MyException("My exception", 2);
    }
}
