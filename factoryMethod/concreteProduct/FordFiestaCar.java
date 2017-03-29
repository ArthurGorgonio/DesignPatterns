package concreteProduct;

import product.Car;

public class FordFiestaCar extends Car {
    public FordFiestaCar(){
        car.factory = "Ford";
        car.name = "Fiesta";
    }
    
    public Car getCar(){
        return car;
    }
}
