package leetcode.hard;

//二叉树的序列化本质上是对其值进行编码，更重要的是对其结构进行编码。可以遍历树来完成上述任务。
//https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/solution/xu-lie-hua-er-cha-shu-by-leetcode-soluti-4duq/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo4 {
    public String serialize(TreeNode root) {
        return rserialize(root, "");
    }

    public TreeNode deserialize(String data) {
        String[] dataArray = data.split(",");
        List<String> dataList = new LinkedList<String>(Arrays.asList(dataArray));
        return rdeserialize(dataList);
    }

    public String rserialize(TreeNode root, String str) {
        if (root == null) {
            str += "None,";
        } else {
            str += str.valueOf(root.val) + ",";
            str = rserialize(root.left, str);
            str = rserialize(root.right, str);
        }
        return str;
    }

    public TreeNode rdeserialize(List<String> dataList) {
        if (dataList.get(0).equals("None")) {
            dataList.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(toString().valueOf(dataList.get(0)));
        dataList.remove(0);
        root.left = rdeserialize(dataList);
        root.right = rdeserialize(dataList);

        return root;
    }
}

class TreeNode {
    String val;
    TreeNode left;
    TreeNode right;
    TreeNode(String x) { val = x; }
}
