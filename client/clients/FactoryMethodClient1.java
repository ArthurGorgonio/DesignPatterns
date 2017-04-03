package clients;

import java.util.Scanner;

import concreteCreator.ChevroletFactory;
import concreteCreator.FiatFactory;
import concreteCreator.FordFactory;
import concreteCreator.VolksFactory;
import creator.CarFactory;

public class FactoryMethod1 {
    public static void main(String[] args){
        String str = null;
        CarFactory cf = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selecione a Montadora!"
                + "\na -> Chevrolet"
                + "\nb -> Fiat"
                + "\nc -> Ford"
                + "\nd -> Volkswagen");
        
        str = input.nextLine();
        str.toLowerCase();
        
        switch (str){
            default:
                System.err.println("Opção inválida");
                break;
            case "a":
                System.out.println("Selecione o Modelo digitando o nome do modelo desejado!");
                cf = new ChevroletFactory();
                System.out.println("Celta"
                        + "\nClassic");
                break;
            case "b":
                System.out.println("Selecione o Modelo digitando o nome do modelo desejado!");
                cf = new FiatFactory();
                System.out.println("Palio"
                        + "\nUno");
                break;
            case "c":
                System.out.println("Selecione o Modelo digitando o nome do modelo desejado!");
                cf = new FordFactory();
                System.out.println("Fiesta"
                        + "\nFocus");
                break;
            case "d":
                System.out.println("Selecione o Modelo digitando o nome do modelo desejado!");
                cf = new VolksFactory();
                System.out.println("Gol"
                        + "\nPolo");
                break;
        }
        
        str = input.nextLine();
        str = str.toLowerCase();
        try{
            cf.getCar(str).exibeInfo();
        }catch (Exception e){
            System.err.println("\nNão existe um carro com esse "
                    + "nome no modelo que o senhor escolheu" + e);
        }
        
        input.close();
    }
}
