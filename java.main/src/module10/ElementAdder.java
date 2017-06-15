package module10;

import java.util.Arrays;

/**
 * Created by citsym on 12.06.17.
 */
public class ElementAdder<T extends CanBeFeeded> {

    public T[] addElementToArray(T[] animals, T element) {
        T[] newArray = Arrays.copyOf(animals, animals.length + 1);
        newArray[newArray.length-1] = element;

        element.feed();
        return newArray;
    }

}
