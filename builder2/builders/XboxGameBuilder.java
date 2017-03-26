package builders;

import builder.GameBuilder;

public class XboxGameBuilder extends GameBuilder {

    @Override
    public void buildName() {
        game.name = "Fifa 2017";
    }

    @Override
    public void buildConsole() {
        game.console = "Jogo para Console Xbox";
    }

    @Override
    public void buildMultiplayer() {
        game.multiplayer = "2 players modos local e online";
    }

    @Override
    public void buildAccs() {
        game.accs = "Controle do Xbox";
    }

    @Override
    public void buildArchivesSystems() {
        game.archivesSystems = "exFAT";
    }

}
