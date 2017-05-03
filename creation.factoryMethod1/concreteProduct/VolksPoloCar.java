package concreteProduct;

import product.Car;

public class VolksPoloCar extends Car {
    public VolksPoloCar(){
        car.factory = "Volkswagen";
        car.name = "Polo";
    }
    
    public Car getCar(){
        return car;
    }
}
