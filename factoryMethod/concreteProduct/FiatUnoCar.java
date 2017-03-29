package concreteProduct;

import product.Car;

public class FiatUnoCar extends Car  {
    
    public FiatUnoCar(){
        this.factory = "Fiat";
        this.name = "Uno";
    }
    
    public Car getCar(){
        return car;
    }
}
