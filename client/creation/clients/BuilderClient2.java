package creation.clients;

import builders.NintendoGameBuilder;
import builders.PlaystationGameBuilder;
import builders.XboxGameBuilder;
import director.GameManager;
import product.Game;

public class BuilderClient2 {
    public static void main(String[] args){
        GameManager gameManager = new GameManager(new XboxGameBuilder());
        
        gameManager.buildGame();
        
        Game game = gameManager.getGame();
        System.out.println("Nome: " + game.name
                + "\nConsole: " + game.console
                + "\nMultiplayer: " + game.multiplayer
                + "\nSistema de Arquivo: " + game.archivesSystems
                + "\nAcessórios: " + game.accs);
        
        System.out.println();
        
        gameManager = new GameManager(new PlaystationGameBuilder());
        
        gameManager.buildGame();
        
        game = gameManager.getGame();
        System.out.println("Nome: " + game.name
                + "\nConsole: " + game.console
                + "\nMultiplayer: " + game.multiplayer
                + "\nSistema de Arquivo: " + game.archivesSystems
                + "\nAcessórios: " + game.accs);
        
        System.out.println();
        
        gameManager = new GameManager(new NintendoGameBuilder());
        
        gameManager.buildGame();
        
        game = gameManager.getGame();
        System.out.println("Nome: " + game.name
                + "\nConsole: " + game.console
                + "\nMultiplayer: " + game.multiplayer
                + "\nSistema de Arquivo: " + game.archivesSystems
                + "\nAcessórios: " + game.accs);
        
        System.out.println();
    }
}
