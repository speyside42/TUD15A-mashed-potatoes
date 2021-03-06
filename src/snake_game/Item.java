package snake_game;

public abstract class Item {

    protected float x_position;
    protected float y_position;

    public Item(float x, float y){
        this.x_position = x;
        this.y_position = y;
    }

    public float getX(){
        return x_position;
    }

    public float getY(){
        return y_position;
    }

    public void setX(float x_position){
        this.x_position = x_position;
    }

    public void setY(float y_position){
        this.y_position = y_position;
    }
}
