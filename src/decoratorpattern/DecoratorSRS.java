package decoratorpattern;

/**
 * Created by Igor on 03.12.15.
 */
public class DecoratorSRS extends CarOptions {
    private Car car;

    public DecoratorSRS(Car car) {
        this.car = car;
    }

    @Override
    public double getCost() {
        return car.getCost() + 40;
    }
}
