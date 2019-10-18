package test.leecode;

import test.leecode.model.TreeNode;

/**
 * Created by xiaomi on 2019/10/18.
 */
public class test_112 {
    public static final boolean hasSum(TreeNode node, int sum){
        if(node.left == null && node.right == null){
            return node.value == sum;
        }

        return hasSum(node.left, sum - node.value) || hasSum(node.right, sum - node.value);

    }

    public static void main(String[] args) {
        TreeNode node = TreeNode.createFromIntArray(new int[]{5, 4, 8, 11, -1, 13, 4, 7, 2, -1, 1});
        System.out.print(hasSum(node, 22));
    }
}
