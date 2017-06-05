package module7.cars;


/**
 * Created by citsym on 05.06.17.
 */
public class Car {

    Engine engine;

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
