package test.leecode;

import test.leecode.model.TreeNode;

/**
 给定两个二叉树，编写一个函数来检验它们是否相同。

 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

 示例 1:

 输入:       1         1
 / \       / \
 2   3     2   3

 [1,2,3],   [1,2,3]

 输出: true
 示例 2:

 输入:      1          1
 /           \
 2             2

 [1,2],     [1,null,2]

 输出: false
 示例 3:

 输入:       1         1
 / \       / \
 2   1     1   2

 [1,2,1],   [1,1,2]

 输出: false

 */
public class test_100 {

    public static final boolean sameTree(TreeNode t1, TreeNode t2){
        if(t1 == null || t2 == null){
            return t1 == t2;
        }

        if(t1.value != t2.value){
            return false;
        }

        return sameTree(t1.left, t2.left) && sameTree(t1.right, t2.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = TreeNode.createFromIntArray(new int[]{1, 2, 3});
        TreeNode root2 = TreeNode.createFromIntArray(new int[]{1, 2, 3});

        System.out.println(sameTree(root1, root2));

        TreeNode root3 = TreeNode.createFromIntArray(new int[]{1, 2});
        TreeNode root4 = TreeNode.createFromIntArray(new int[]{1, Integer.MIN_VALUE, 2});

        System.out.println(sameTree(root3, root4));

        TreeNode root5 = TreeNode.createFromIntArray(new int[]{1, 2, 1});
        TreeNode root6 = TreeNode.createFromIntArray(new int[]{1, 1, 2});

        System.out.println(sameTree(root5, root6));
    }
}
