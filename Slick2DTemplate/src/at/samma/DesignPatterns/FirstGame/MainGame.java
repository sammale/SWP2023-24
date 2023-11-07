package at.samma.DesignPatterns.FirstGame;

import org.newdawn.slick.*;

public class MainGame extends BasicGame {

    private int x,y;
    private float angle;
    private float radius;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {

        this.angle = 0;
        this.radius = 350;

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {

        float centerX = 400;
        float centerY = 300;

        this.x = (int) (centerX + radius * Math.cos(Math.toRadians(angle)));
        this.y = (int) (centerY + radius * Math.sin(Math.toRadians(angle)));

        angle++;
        System.out.println(angle);

    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {

        graphics.drawRect(this.x, this.y, 50, 50);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("MainGame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
