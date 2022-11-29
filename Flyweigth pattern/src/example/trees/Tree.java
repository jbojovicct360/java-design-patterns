package example.trees;

import java.awt.*;

/**
 *  Contains state unique for each tree
 */
public class Tree {

    /**
     * Extrinsic state
     */
    private int x;
    private int y;

    /**
     * Extrinsic state
     */
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
