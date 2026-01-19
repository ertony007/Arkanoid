package GameObjects;

import Configuration.Config;
import Engine.Collidable;
import Engine.GameObject;
import Engine.InputHandler;

import java.awt.*;

public class Player extends GameObject implements Collidable {
    private InputHandler input;
    private float speed = 4.5f;
    public Player(float x, float y, InputHandler input) {
        super(x, y, Config.Playerwidth, Config.Playerheight); // usar el mismo
        this.input = input;
    }

    @Override
    public void update(float delta) {
        if (input.left)  x -= speed * delta;
        if (input.right) x += speed * delta;

        // límites
        if (x < 0) x = 0;
        if (x + width > Config.Gamewidth) x = Config.Gamewidth - width;
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.drawRect((int)x, (int)y, width, height);
        g.setColor(Color.GREEN);
        g.fillRect((int)x, (int)y, width, height);
    }

    @Override
    public void onCollision(GameObject other) {

    }
}
