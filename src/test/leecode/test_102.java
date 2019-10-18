package test.leecode;

import test.leecode.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xiaomi on 2019/10/18.
 */
public class test_102 {

    public static final void visitLevel(TreeNode treeNode){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);

        List<List<Integer>> result = new ArrayList<>();

        while(queue.size() > 0){
            int size = queue.size();

            List<Integer> temp = new ArrayList<>();

            for(int i = 0 ; i < size; i ++){
                TreeNode node = queue.poll();
                temp.add(node.value);

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }

            result.add(temp);
        }

        System.out.print(result);

    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromIntArray(new int[]{3, 9, 20, -1, -1, 15, 7});
        visitLevel(root);

    }
}
