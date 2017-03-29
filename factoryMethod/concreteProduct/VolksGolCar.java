package concreteProduct;

import product.Car;

public class VolksGolCar extends Car {
    public VolksGolCar(){
        car.factory = "Volkswagen";
        car.name = "Gol";
    }
    
    public Car getCar(){
        return car;
    }
}
