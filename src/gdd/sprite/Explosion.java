package gdd.sprite;

import javax.swing.*;
import java.awt.*;

import static gdd.Global.IMG_EXPLOSION;
import static gdd.Global.SCALE_FACTOR;

public class Explosion extends Sprite {
    public int visibleFrames = 10;

    public void visibleCountDown() {
        if (visibleFrames > 0) {
            visibleFrames--;
        } else {
            setVisible(false);
        }
    }

    public Explosion(int enemyX, int enemyY){
        this.x = enemyX;
        this.y = enemyY;
        initExplosion();
    }

    private void initExplosion() {
        var ii = new ImageIcon(IMG_EXPLOSION);

        // Scale the image to use the global scaling factor
        var scaledImage = ii.getImage().getScaledInstance(ii.getIconWidth() * SCALE_FACTOR,
                ii.getIconHeight() * SCALE_FACTOR,
                java.awt.Image.SCALE_SMOOTH);
        setImage(scaledImage);

        setX(this.x);
        setY(this.y);
    }
}
