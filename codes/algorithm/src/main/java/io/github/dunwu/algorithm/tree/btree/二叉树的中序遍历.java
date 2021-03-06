package io.github.dunwu.algorithm.tree.btree;

import io.github.dunwu.algorithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:forbreak@163.com">Zhang Peng</a>
 * @since 2020-07-06
 */
public class 二叉树的中序遍历 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        backtrack(root, list);
        return list;
    }

    public static void backtrack(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left != null) backtrack(root.left, list);
        list.add(root.val);
        if (root.right != null) backtrack(root.right, list);
    }

}
