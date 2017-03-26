package builders;

import builder.GameBuilder;

public class PlaystationGameBuilder extends GameBuilder {

    @Override
    public void buildName() {
        game.name = "Need for Speed Most Wanted";
    }

    @Override
    public void buildConsole() {
        game.console = "Jogo para Console Playstation";
    }

    @Override
    public void buildMultiplayer() {
        game.multiplayer = "2 players modos local e online";
    }

    @Override
    public void buildAccs() {
        game.accs = "Controle do playstation";
    }

    @Override
    public void buildArchivesSystems() {
        game.archivesSystems = "OSHII";
    }

}
