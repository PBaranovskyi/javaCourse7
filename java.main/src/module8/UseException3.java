package module8;

/**
 * Created by citsym on 08.06.17.
 */
public class UseException3 {

    public static void main(String[] args) {

        System.out.println(f());


    }

    private static int f() {
        try {
            g();
            return 1;
        }catch (MyException e){
            System.out.println("I caught " + e.getMessage());
            f();
            return 3;
//            throw new RuntimeException("Ooops");
        } finally {
            System.out.println("FINALLY");
            return 5;
        }

    }

    private static void g() throws MyException {
        throw new MyException("My ex", 1);
    }
}
