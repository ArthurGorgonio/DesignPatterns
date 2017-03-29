package concreteProduct;

import product.Car;

public class ChevroletClassicCar extends Car {
    
    public ChevroletClassicCar(){
        this.factory = "Chevrolet";
        this.name = "Classic";
    }
    
    public Car getCar(){
        return car;
    }
}
