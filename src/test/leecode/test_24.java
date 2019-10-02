package test.leecode;

import test.leecode.model.Node;

/**
 * Created by linniu on 2019/10/1.
 */

//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
//        你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//
//         
//
//        示例:
//
//        给定 1->2->3->4, 你应该返回 2->1->4->3.
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

public class test_24 {

    public static final void exchange(Node node){
        Node curHead = node;

        while(curHead.next != null && curHead.next.next != null){
            Node second = curHead.next;
            Node third = second.next;
            curHead.next = third;
            second.next = third.next;
            third.next = second;

            curHead = second;

        }
    }


    public static void main(String[] args) {
        Node head = new Node(-1);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        head.print(null);

        exchange(head);

        head.print(null);
    }

}
