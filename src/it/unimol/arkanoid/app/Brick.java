package it.unimol.arkanoid.app;

public class Brick extends Sprite {

    private boolean destroyed;

    public Brick(int x, int y) {

        initBrick(x, y);
    }

    private void initBrick(int x, int y) {

        this.x = x;
        this.y = y;

        destroyed = false;

        loadImage();
        getImageDimensions();
    }

    private void loadImage() {
        image = ImageLoader.loadImage("brick.png");
    }

    boolean isDestroyed() {

        return destroyed;
    }

    void setDestroyed(boolean val) {

        destroyed = val;
    }
}
