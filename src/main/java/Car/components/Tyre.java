package Car.components;

public class Tyre {
    private int life;

    public Tyre(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void reduceLife(int distance) {
        this.life -= distance;
    }
}


