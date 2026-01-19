package SimpleSample;

import Engine.Game;
import Engine.Scene;
import Escenas.Escena1;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuScene extends Scene {

    public MenuScene(Game game) {
        super(game);
    }

    @Override
    public void update(float delta) {
        super.update(delta);
        // Si pulsamos espacio, el menú le dice al motor que cambie a la Escena 1
        if (input.isKeyPressed(KeyEvent.VK_SPACE)) {
            game.setScene(new Escena1(game));
        }
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.drawString("Chafanoid - Pulsa ESPACIO para jugar", 200, 300);
        super.render(g);
    }
}