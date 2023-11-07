package at.samma.DesignPatterns.BasicGame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame{
    private int x,y;
    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        //wird 1 mal aufgerufen

        this.x = 100;
        this.y = 100;
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        //delta = Zeit seit dem letzten Aufruf

        this.x++;
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        //es wird gezeichnet

        graphics.drawRect(this.x, this.y, 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
