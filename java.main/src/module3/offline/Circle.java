package module3.offline;

/**
 * Created by citsym on 11.05.17.
 */
public class Circle extends Shape {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return r == circle.r;
    }

    @Override
    public int hashCode() {
        return r;
    }
}
