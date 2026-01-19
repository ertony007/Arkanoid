import Configuration.Config;
import Engine.Game;
import SimpleSample.MenuScene;


void main(String[] args) {

    Game game = new Game(Config.Gamewidth, Config.Gameheight, "Arkanoid");
    game.setScene(new MenuScene(game));
    game.start();
}
