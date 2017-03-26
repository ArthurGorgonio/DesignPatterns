package director;

import builder.GameBuilder;
import product.Game;

public class GameManager {
    protected GameBuilder game;
    
    public GameManager(GameBuilder gameBuilder){
        game = gameBuilder;
    }
    public void buildGame(){
        game.buildName();
        
        game.buildMultiplayer();
        
        game.buildConsole();
        
        game.buildArchivesSystems();
        
        game.buildAccs();
    }
    
    public Game getGame(){
        return game.getGame();
    }
}
