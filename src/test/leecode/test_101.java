package test.leecode;

import test.leecode.model.TreeNode;

/**
     给定一个二叉树，检查它是否是镜像对称的。

     例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

     1
     / \
     2   2
     / \ / \
     3  4 4  3
     但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

     1
     / \
     2   2
     \   \
     3    3
     说明:

     如果你可以运用递归和迭代两种方法解决这个问题，会很加分

 */
public class test_101 {

    public static final boolean test(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }

        if(left.value != right.value){
            return false;
        }

        return test(left.left, right.right) && test(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode node = TreeNode.createFromIntArray(new int[]{1,2,2,3,4,4,3});
//        TreeNode.visitTree(node);
        System.out.print(test(node.left, node.right));

        node = TreeNode.createFromIntArray(new int[]{1,2,2,Integer.MIN_VALUE,3,Integer.MIN_VALUE,3});
        System.out.print(test(node.left, node.right));
//        TreeNode.visitTree(node);
    }
}
