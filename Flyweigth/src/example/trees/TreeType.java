package example.trees;

import java.awt.*;

/**
 * ~~~ Flyweight object ~~~
 * Many trees share the same properties (name, color, other info)
 * we can apply the Flyweight pattern and store these values inside separate flyweight objects (this class).
 * Now, instead of storing the same data in thousands of Tree objects,
 * we’re going to reference one of the flyweight objects with a particular set of values.
 */
public class TreeType {

    /**
     * Intrinsic state
     */
    private String name;
    private Color color;
    private String otherInfo;

    public TreeType(String name, Color color, String otherInfo) {
        this.name = name;
        this.color = color;
        this.otherInfo = otherInfo;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
