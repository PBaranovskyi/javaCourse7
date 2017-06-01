package module10;

/**
 * Created by citsym on 29.05.17.
 */
public class UseRecursion {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 100; i++) {
            count += i;
        }

        System.out.println("result " + count);


        int i = 0;
        count = 0;
        while (i < 100) {
            count += i;
            i++;
        }

        System.out.println("result " + count);

        count = 0;
        i = 0;
        count = add(count, i);

        System.out.println("result " + count);
    }

    private static int add(int count, int i) {
        if (i == 100) {
            return count;
        }

        count += i;
        return add(count, ++i);
    }
}
