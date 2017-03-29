package concreteCreator;

import concreteProduct.VolksGolCar;
import concreteProduct.VolksPoloCar;
import creator.CarFactory;
import product.Car;

public class VolksFactory extends CarFactory {

    @Override
    public Car getCar(String name) {
        if(name.equals("gol")){
            return new VolksGolCar();
        }else {
            return new VolksPoloCar();
        }
    }

}
