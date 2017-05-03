package concreteCreator;

import concreteProduct.ChevroletCeltaCar;
import concreteProduct.ChevroletClassicCar;
import creator.CarFactory;
import product.Car;

public class ChevroletFactory extends CarFactory {
    
    @Override
    public Car getCar(String name) {
        if(name.equals("classic")){
            return new ChevroletClassicCar();
        }else {
            return new ChevroletCeltaCar();
        }
    }
}
