package clients;

import java.util.Scanner;

import abstractPrinter.Printer;
import factories.ArchiveFactory;
import factories.ConsoleFactory;
import helloWorld.HelloWorld;

public class AbstractFactoryClient2 {
    public static void main(String[] args) {
        String str = null;
        Printer console = null;
        HelloWorld hl;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selecione uma das opções para continuar!\na -> Console\nb -> Arquivo");
        str = input.nextLine();
        if(str.equals("a")){
            hl = new ConsoleFactory();
            console = hl.helloWorld();
        }else if(str.equals("b")){
            hl = new ArchiveFactory();
            console = hl.helloWorld();
        }
        if(console != null){
        console.showMensage();
        System.out.println();
        }else{
            System.err.println("Comando Inválido!");
        }
        input.close();
    }
}