package example.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Contains state shared by several trees
 */
public class TreeFactory {

    static Map<String, TreeType> treeTypes = new HashMap<>();

    /**
     *
     * @param name intrinsic property
     * @param color intrinsic property
     * @param otherInfo intrinsic property
     * @return intrinsic state if it already exists (reusing the existent one, hence saving memory),
     * if not, a new intrinsic state is created and returned
     */
    public static TreeType getTreeType(String name, Color color, String otherInfo) {

        TreeType result = treeTypes.get(name);

        if (result == null) {
            result = new TreeType(name, color, otherInfo);
            treeTypes.put(name, result);
        }

        return result;
    }
}
