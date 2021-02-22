import java.awt.*;

public class Apple {
    private int x,y,width , height;

    public Apple(int x, int y,int tileSize) {
        this.x = x;
        this.y = y;
        width = tileSize;
        height=tileSize;
    }

    public void tick(){

    }

    public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x*width,y*height,width,height);
        //g.fillRect(x*width,y*height,width,height); //painting

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
