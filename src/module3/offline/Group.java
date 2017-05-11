package module3.offline;

import java.util.ArrayList;

/**
 * Created by citsym on 11.05.17.
 */
public class Group extends ArrayList<Shape> {

//    List<Shape> listOfSHapes = new ArrayList<>();

//    void add(Shape shape){
//        listOfSHapes.add(shape);
//    }

    double getMinArea(){

        if (this.isEmpty()){
            return 0;
        }

        double minArea = Double.MAX_VALUE;

        for (Shape shape : this) {
            if (shape.getArea() < minArea){
                minArea = shape.getArea();
            }
        }

        return minArea;
    }

}
