package creator;

import product.Car;

public abstract class CarFactory {
    protected Car c;
    public abstract Car getCar(String name);
}
