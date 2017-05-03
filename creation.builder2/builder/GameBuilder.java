package builder;

import product.Game;

public abstract class GameBuilder {
    protected Game game;

    public GameBuilder() {
        game = new Game();
    }

    public abstract void buildName();
    
    public abstract void buildConsole();
    
    public abstract void buildMultiplayer();
    
    public abstract void buildAccs();
    
    public abstract void buildArchivesSystems();

    public Game getGame() {
        return game;
    }
}
