package GameObjects;

import Configuration.Config;
import Engine.Collidable;
import Engine.GameObject;

import java.awt.*;

public class Brick extends GameObject implements Collidable {

    /**
     * Constructor base para un objeto de juego.
     *
     * @param x      Posición inicial en el eje X.
     * @param y      Posición inicial en el eje Y.
     * @param width  Ancho del objeto.
     * @param height Alto del objeto.
     */

    public Brick(float x, float y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void onCollision(GameObject other) {
        if (other instanceof Ball){

        }
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(new Color(100,150,20));
        g.fillRect((int)x,(int)y, Config.BrickWidth, Config.BrickHeight);
    }
}
