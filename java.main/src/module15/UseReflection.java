package module15;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by citsym on 10.07.17.
 */
public class UseReflection {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        RandomArrayGenerator instance = new RandomArrayGenerator();

//        invokeMethodOnTheInstance(instance, "generate");


        for (Method method : instance.getClass().getDeclaredMethods()) {

            System.out.print(method.getName());
            for (Class<?> aClass : method.getParameterTypes()) {
                System.out.println(" param " + aClass);
            }


            MyAnnotation declaredAnnotation = method.getDeclaredAnnotation(MyAnnotation.class);

            if (declaredAnnotation != null){
                System.out.println();
                System.out.println(method.getName() + " is what we need");


                method.setAccessible(true);
                String value = declaredAnnotation.value();
                int[] intArray;
                if (value.isEmpty()) {
                    intArray = (int[]) method.invoke(instance);
                } else{
                    intArray =  (int[]) method.invoke(instance, Integer.valueOf(value));
                }

                method.setAccessible(false);

                System.out.println(Arrays.toString(intArray));
            }

        }




    }

    private static void invokeMethodOnTheInstance(RandomArrayGenerator instance, String methodName, Class<?>... parameterTypes) throws IllegalAccessException, InvocationTargetException {
        try {
            Method generateMethod = instance.getClass().getDeclaredMethod(methodName, int.class);

            generateMethod.setAccessible(true);
            int[] intArray =  (int[]) generateMethod.invoke(instance, 6);
            generateMethod.setAccessible(false);

            System.out.println(Arrays.toString(intArray));
        } catch (NoSuchMethodException e) {
            System.err.println("No such method");
        }
    }
}
