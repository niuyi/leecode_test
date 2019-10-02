package test.leecode;


import test.leecode.model.Node;

/**
 * Created by linniu on 2019/10/1.
 */

//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
//        示例：
//
//        输入：1->2->4, 1->3->4
//        输出：1->1->2->3->4->4
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class test_21 {

    public static final Node merge(Node node1, Node node2){
        Node node1Cur = node1;
        Node node2Cur = node2;
        Node mergeNodeCur = null;
        Node mergeNodeHead = null;

        while(node1Cur != null && node2Cur != null){
            if(node1Cur.value < node2Cur.value){
                if(mergeNodeCur == null){
                    mergeNodeCur = new Node(node1Cur.value);
                    mergeNodeHead = mergeNodeCur;
                }else{
                    mergeNodeCur.next = new Node(node1Cur.value);
                    mergeNodeCur = mergeNodeCur.next;
                }

                node1Cur = node1Cur.next;
            }else{
                if(mergeNodeCur == null){
                    mergeNodeCur = new Node(node2Cur.value);
                    mergeNodeHead = mergeNodeCur;
                }else{
                    mergeNodeCur.next = new Node(node2Cur.value);
                    mergeNodeCur = mergeNodeCur.next;
                }

                node2Cur = node2Cur.next;
            }
        }

        if(node1Cur != null){
            mergeNodeCur.next = node1Cur;
        }

        if(node2Cur != null){
            mergeNodeCur.next = node2Cur;
        }

        return mergeNodeHead;

    }

    public static final Node merge2(Node node1, Node node2){
        if(node1 == null){
            return node2;
        }

        if(node2 == null){
            return node1;
        }

        if(node1.value <  node2.value){
            node1.next = merge2(node1.next, node2);
            return node1;
        }else{
            node2.next = merge2(node1, node2.next);
            return node2;
        }
    }

    public static void main(String[] args) {
        Node node1 = Node.create(new int[]{1, 2, 4});
        node1.print(null);

        Node node2 = Node.create(new int[]{1, 3, 4});
        node2.print(null);

//        Node merge = merge(node1, node2);
        Node merge = merge2(node1, node2);

        merge.print(null);
    }
}
