package Escenas;

import Configuration.Config;
import Engine.Game;
import Engine.Scene;
import GameObjects.Ball;
import GameObjects.Brick;
import GameObjects.DeadLine;
import GameObjects.Player;

import java.awt.*;

public class Escena1 extends Scene {

    public Escena1(Game game) {
        super(game);

        this.addObject(new Ball(300, 300, 25, 25, 25));

        this.addObject(new DeadLine(0, 595, Config.Gamewidth, 5));

        this.addObject(new Player(300, 500, input));

        for (int i = 0; i < 10; i++) {
            this.addObject(new Brick(20 + (Config.BrickWidth + Config.BrickGapX) * i ,20, Config.BrickWidth,Config.BrickHeight));
            for (int j = 0; j < 5; j++) {
                this.addObject(new Brick(20 ,20 + (Config.BrickHeight + Config.BrickGapY) * j, Config.BrickWidth,Config.BrickHeight));
            }
        }

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
