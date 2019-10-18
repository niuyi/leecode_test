package test.leecode;

import test.leecode.model.TreeNode;

/**
 * Created by xiaomi on 2019/10/18.
 */
public class test_104 {

    public static final int max(TreeNode node){
        if(node == null){
            return 0;
        }

        return Math.max(max(node.left) + 1 , max(node.right) + 1);
    }


    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromIntArray(new int[]{3, 9, 20, -1, -1, 15, 7});
        System.out.print(max(root));
    }
}
