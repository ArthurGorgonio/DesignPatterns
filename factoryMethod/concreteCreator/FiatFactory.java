package concreteCreator;

import concreteProduct.FiatPalioCar;
import concreteProduct.FiatUnoCar;
import creator.CarFactory;
import product.Car;

public class FiatFactory extends CarFactory {
    
    @Override
    public Car getCar(String name) {
        if(name.equals("palio")){
            return new FiatPalioCar();
        }else {
            return new FiatUnoCar();
        }
    }

}
