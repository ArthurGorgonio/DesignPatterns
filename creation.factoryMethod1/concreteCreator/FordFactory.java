package concreteCreator;

import concreteProduct.FordFiestaCar;
import concreteProduct.FordFocusCar;
import creator.CarFactory;
import product.Car;

public class FordFactory extends CarFactory {
    
    @Override
    public Car getCar(String name) {
        if(name.equals("fiesta")){
            return new FordFiestaCar();
        }else {
            return new FordFocusCar();
        }
    }
}
