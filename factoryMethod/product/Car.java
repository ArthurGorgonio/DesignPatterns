package product;

public abstract class Car {
    public String name, factory;
    protected Car car;
    public Car getCar() {
        return car;
    }
    public void exibeInfo(){
        System.out.println("Nome: " + name
                + "\nMarca: "+ factory);
    }
}
