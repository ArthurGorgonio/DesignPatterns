package concreteProduct;

import product.Car;

public class FiatPalioCar extends Car {
    public FiatPalioCar(){
        this.factory = "Fiat";
        this.name = "Palio";
    }
    public Car getCar(){
        return car;
    }
}
