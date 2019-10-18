package test.leecode;

import test.leecode.model.TreeNode;

/**
 * Created by xiaomi on 2019/10/18.
 */
public class test_111 {

    public static final int getMin(TreeNode node){
        if(node == null || node.value < 0)
            return 0;

        int left = getMin(node.left);
        int right = getMin(node.right);

        if(left == 0){
            return right + 1;
        }

        if(right == 0){
            return left + 1;
        }

        return Math.min(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.createFromIntArray(new int[]{3, 9, 20, -1, -1, 15, 7});

        System.out.print(getMin(treeNode));

    }
}
