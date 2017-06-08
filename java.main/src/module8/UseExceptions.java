package module8;

/**
 * Created by citsym on 08.06.17.
 */
public class UseExceptions {

    public static void main(String[] args) {

        Object someObj = new MyException("");

//        try {
//            System.out.println(someObj.hashCode());
//        } catch (RuntimeException e) {
//            someObj = new Object();
//            System.out.println(someObj.hashCode());
//        }

        if (someObj!=null){
            System.out.println(someObj.hashCode());
        } else {
            someObj = new Object();
            System.out.println(someObj.hashCode());
        }


        System.out.println("I want to see this");

    }
}
