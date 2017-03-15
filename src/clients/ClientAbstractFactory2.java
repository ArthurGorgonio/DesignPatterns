package clients;

import java.util.Scanner;

import abstractFactory.abstractPrinter.Printer;
import abstractFactory.factories.ArchiveFactory;
import abstractFactory.factories.ConsoleFactory;
import abstractFactory.helloWord.HelloWord;

public class ClientAbstractFactory2 {
    public static void main(String[] args) {
        String str = null;
        Printer console = null;
        HelloWord hl;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selecione uma das opções para continuar!\na -> Console\nb -> Arquivo");
        str = input.nextLine();
        if(str.equals("a")){
            hl = new ConsoleFactory();
            console = hl.helloWord();
        }else if(str.equals("b")){
            hl = new ArchiveFactory();
            console = hl.helloWord();
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