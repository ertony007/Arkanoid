package GameObjects;

import Engine.Collidable;
import Engine.GameObject;
import Configuration.Config;

import java.awt.*;

public class Ball extends GameObject implements Collidable {



    public Ball(float x, float y, int width, int height, int radius) {
        super(x, y, width, height);

        int radius1 = width / 2;

        this.speedX = 4;
        this.speedY = 5;
    }

    @Override
    public void update(float delta) {
        x += speedX * delta;
        y += speedY * delta;

        if (x < 0) {
            x = 0;
            speedX = -speedX;
        } else if (x + width > Config.Gamewidth) {
            x = Config.Gamewidth - width;
            speedX = -speedX;
        }

        if (y < 0) {
            y = 0;
            speedY = -speedY;
        } else if (y + height > Config.Gameheight) {
            y = Config.Gameheight - height;
            speedY = -speedY;
        }
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.drawRect((int)x, (int)y, width, height);
        g.setColor(Color.GREEN);
        g.fillOval((int)x, (int)y, width, height);
    }

    @Override
    public void onCollision(GameObject other) {
        if (other.getClass() == Player.class || other instanceof Brick)

            if (other.getClass() == Player.class){
            Rectangle interseccion = this.getBounds().intersection(other.getBounds());

            if (interseccion.width < interseccion.height){
                speedX = -speedX;
            }
            if (this.x < other.getX()) this.x -= interseccion.width;
            else this.x += interseccion.width;

            } else {
            speedY = -speedY;
        }
    }
}
