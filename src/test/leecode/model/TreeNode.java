package test.leecode.model;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by linniu on 2019/10/17.
 */
public class TreeNode {
    public int value;

    public TreeNode left;
    public TreeNode right;

    public static final TreeNode createFromIntArray(int[] array){
        TreeNode root = null;

        Queue<TreeNode> queue = new LinkedList<>();

        for(int i : array){
            TreeNode node = new TreeNode();
            node.value = i;

            if(root == null){
                root = node;
                queue.offer(root);
                continue;
            }

            TreeNode parent = queue.peek();
            if(parent.left == null){
                parent.left = node;
            }else{
                parent.right = node;
                queue.poll();
            }

            queue.offer(node);

        }

        return root;
    }

//    public static final TreeNode createFromIntArray(int[] array){
//        TreeNode root = null;
//        TreeNode current = null;
//        boolean isLeft = true;
//
//
//        for(int i : array){
//            TreeNode node = new TreeNode();
//            if(i == Integer.MIN_VALUE){
//                node = null;
//            }else{
//                node.value = i;
//            }
//
//
//            if(current == null){
//                current = node;
//                if(root == null) {
//                    root = current;
//                }
//
//                continue;
//            }
//
//            if(isLeft){
//                current.left = node;
//                isLeft = false;
//            }else{
//                current.right = node;
//                isLeft = true;
//                current = null;
//            }
//        }
//
//        return root;
//    }

    public static final void visitTree(TreeNode node){
        if(node == null){
//            System.out.print("_null_");
            return;
        }

        System.out.print(node.value);

        visitTree(node.left);
        visitTree(node.right);
    }

    public static void main(String[] args) {
        TreeNode fromIntArray = TreeNode.createFromIntArray(new int[]{1, 2, 3, 4, 5 ,6});
        visitTree(fromIntArray);

//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(1);
//        queue.offer(2);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.size());
    }
}
