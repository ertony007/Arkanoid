package Escenas;

import Configuration.Config;
import Engine.Game;
import Engine.Scene;
import GameObjects.Ball;
import GameObjects.DeadLine;
import GameObjects.Player;

import java.awt.*;

public class Escena1 extends Scene {

    public Escena1(Game game) {
        super(game);

        Ball ball = new Ball(300, 300, 25, 25, 25);
        this.addObject(ball);

        DeadLine deadLine = new DeadLine(0, 595, Config.Gamewidth, 5);
        this.addObject(deadLine);

        Player player = new Player(300, 500, input);
        this.addObject(player);
    }

    @Override
    public void update(float delta) {
        super.update(delta);
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Config.Gamewidth, Config.Gameheight);

        super.render(g);
    }
}
