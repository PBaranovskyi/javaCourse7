package module3.questions;

import java.util.ArrayList;

/**
 * Created by citsym on 15.05.17.
 */
public class UseArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(){
            @Override
            public boolean add(Integer integer) {

                for (int i = 0; i < this.size(); i++) {

                    this.set(i, this.get(i) + integer);

                }
                super.add(integer);

                System.out.println(this);
                return true;

            }
        };

        list.add(1);
        list.add(10);
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(3);
        list.remove(Integer.valueOf(1));

        System.out.println(list);

//        list =  evenList(list);


//        for (int i = 0; i < list.size(); i++) {
//            if (i % 3 == 0) {
//                list.set(i, list.get(i) * 3);
//            }
//        }

//        for (Integer item : list) {
//            if (item > 10){
//                System.out.println(item);
//                list.add(item);
//            }
//        }

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next > 10) {
//                iterator.remove();
//            }
//        }


        System.out.println(list);

    }

    private static ArrayList<Integer> evenList(ArrayList<Integer> inputList) {

        ArrayList newList = new ArrayList();
        for (Integer integer : inputList) {
            if (integer % 2 == 0) {
                newList.add(integer);
            }
        }

        return newList;
    }
}
