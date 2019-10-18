package test.leecode;

import test.leecode.model.TreeNode;

/**
 * Created by xiaomi on 2019/10/18.
 */
public class test_108 {

    public static final TreeNode createTree(int[] array, int start, int end){
        if(start > end){
            return null;
        }

        int mid = start + (end - start)/2;

        if(mid >= array.length){
            return null;
        }

        TreeNode node = new TreeNode();
        node.value = array[mid];

        TreeNode left = createTree(array, start, mid - 1);
        node.left = left;

        node.right = createTree(array, mid + 1, end);

        return node;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-10, -3, 0, 5, 9};

        TreeNode tree = createTree(array, 0, array.length);
        TreeNode.visitTree(tree);
    }
}
