package builders;

import builder.GameBuilder;

public class NintendoGameBuilder extends GameBuilder {

    @Override
    public void buildName() {
        game.name = "Super Mario World";
    }

    @Override
    public void buildConsole() {
        game.console = "Jogo para Console Nintendo";
    }

    @Override
    public void buildMultiplayer() {
        game.multiplayer = "Até 4 players modo Local";
    }

    @Override
    public void buildAccs() {
        game.accs = "Controle do Nintendo";
    }

    @Override
    public void buildArchivesSystems() {
        game.archivesSystems = "FAT32";
    }
}
