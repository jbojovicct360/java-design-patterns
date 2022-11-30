package example.forest;

import example.trees.Tree;
import example.trees.TreeFactory;
import example.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        /**
         * Getting intrinsic state of a tree
         */
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);

        /**
         * Instantiating a new object with reused TreeTpe
         */
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    /**
     * Drawing out the trees
     * @param graphics the specified Graphics window
     */
    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
