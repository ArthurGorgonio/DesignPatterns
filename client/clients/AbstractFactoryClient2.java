package clients;

import java.util.Scanner;

import factories.ArchiveFactory;
import factories.ConsoleFactory;
import helloWorld.HelloWorld;

/* Client of the Abstract Factory Pattern */
public class AbstractFactoryClient2 {
    public static void main(String[] args) {
        String str = null;
        HelloWorld hl = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selecione uma das opções para continuar!\na -> Console\nb -> Arquivo");
        str = input.nextLine();
        if(str.equals("a")){
            hl = new ConsoleFactory();
        }else if(str.equals("b")){
            hl = new ArchiveFactory();
        }else{
            System.err.println("Comando Inválido!");
        }
        if(hl != null){
            hl.helloWorld();
            System.out.println();
        }else{
            System.err.println("Comando Inválido!");
        }
        input.close();
    }
}