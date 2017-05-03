package concreteProduct;

import product.Car;

public class FordFocusCar extends Car{
    public FordFocusCar(){
        car.factory = "Ford";
        car.name = "Focus";
    }
    
    public Car getCar(){
        return car;
    }
}
