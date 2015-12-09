package decoratorpattern;

/**
 * Created by Igor on 03.12.15.
 */
public class DecoratorABS extends CarOptions {
    private Car car;

    public DecoratorABS(Car car) {
        this.car = car;
    }

    @Override
    public double getCost() {
        return car.getCost() + 70;
    }
}
