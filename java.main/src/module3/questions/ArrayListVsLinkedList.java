package module3.questions;

import java.util.*;

/**
 * Created by citsym on 15.05.17.
 */
public class ArrayListVsLinkedList {

    public static void main(String[] args) {


//        List<Integer> arrayList = new ArrayList<>();
//
//
//        System.out.println("Array List");
//        addingElelements(arrayList);
//        addingElelementsInTheBeginnig(arrayList);
//        removingElelementsInTheBeginnig(arrayList);
//        removingElelementsInTheEnd(arrayList);
//        removingElelementsInTheMiddle(arrayList);
//
//        //////
//
//
//        List<Integer> linkedList = new LinkedList<>();
//        System.out.println("Linked List");
//        addingElelements(linkedList);
//        addingElelementsInTheBeginnig(linkedList);
//        removingElelementsInTheBeginnig(linkedList);
//        removingElelementsInTheEnd(linkedList);
//        removingElelementsInTheMiddle(linkedList);
//


        List<Integer> listToRemove = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            listToRemove.add(i);
        }

        Object[] objects = listToRemove.toArray();
        int countOfElementsToRemove = 100;
        int indexWhereStartRemoveing = 50;
        System.arraycopy(objects, indexWhereStartRemoveing + countOfElementsToRemove , objects, indexWhereStartRemoveing, countOfElementsToRemove);
        objects = Arrays.copyOf(objects, objects.length - countOfElementsToRemove);

        System.out.println(Arrays.asList(objects));


    }

    private static void removingElelementsInTheMiddle(List<Integer> list) {
        long beforeTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            list.remove(list.size() / 2);
        }
        System.out.println(" Removing elements in the middle :" + (System.currentTimeMillis() - beforeTime));

    }

    private static void removingElelementsInTheEnd(List<Integer> list) {
        long beforeTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            list.remove(list.size()-1);
        }
        System.out.println(" Removing elements in the end :" + (System.currentTimeMillis() - beforeTime));

    }


    private static void removingElelementsInTheBeginnig(List<Integer> list) {
        long beforeTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            list.remove(0);
        }
        System.out.println(" Removing elements in the beginning :" + (System.currentTimeMillis() - beforeTime));


    }

    private static void addingElelementsInTheBeginnig(List<Integer> list) {
        long beforeTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            list.add(0, i);
        }
        System.out.println(" Adding elements in the beginning :" + (System.currentTimeMillis() - beforeTime));


    }

    private static void addingElelements(List<Integer> list) {
        long beforeTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        System.out.println(" Adding elements :" + (System.currentTimeMillis() - beforeTime));
    }
}
