package decoratorpattern;

/**
 * Created by Igor on 03.12.15.
 */
public class DecoratorAudio extends CarOptions {
   private Car car;

    public DecoratorAudio(Car car) {
        this.car = car;
    }

    @Override
    public double getCost() {
        return car.getCost() + 25;
    }
}
