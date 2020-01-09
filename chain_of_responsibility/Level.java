
public class Level {
    public int num;

    public Level(int num) {
        this.num = num;
    }

    public boolean lessThan(Level level) {
        return num < level.num;
    }
}
