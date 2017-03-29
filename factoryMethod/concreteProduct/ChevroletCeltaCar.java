package concreteProduct;

import product.Car;

public class ChevroletCeltaCar extends Car{
    
    public ChevroletCeltaCar(){
        this.factory = "Chevrolet";
        this.name = "Celta";
    }
    
    public Car getCar(){
        return car;
    }

}
