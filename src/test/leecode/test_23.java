package test.leecode;


import test.leecode.model.Node;

import java.util.Comparator;
import java.util.PriorityQueue;


/*
    合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。

    示例:

    输入:
    [
      1->4->5,
      1->3->4,
      2->6
    ]
    输出: 1->1->2->3->4->4->5->6

*/

public class test_23 {

    public static final Node merge(Node[] nodes){
        PriorityQueue<Node> queue = new PriorityQueue<>(20, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.valueOf(o1.value).compareTo(Integer.valueOf(o2.value));
            }
        });

        for(Node node : nodes){
            queue.offer(node);
        }

        Node ret = new Node(-1);
        Node current = null;

        while(true){
            Node node = queue.poll();
            if(node == null)
                break;

            Node newNode = new Node(node.value);
            if(current == null){
                current = newNode;
                ret.next = current;
            }else{
                current.next = newNode;
                current = newNode;
            }

            if(node.next != null){
                queue.offer(node.next);
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        Node node1 = Node.create(new int[]{1, 4, 5});
        Node node2 = Node.create(new int[]{1, 3, 4});
        Node node3 = Node.create(new int[]{2, 6});

        node1.print(null);
        node2.print(null);
        node3.print(null);

        Node merge = merge(new Node[]{node1, node2, node3});

        merge.print(null);


        //test queue
//        PriorityQueue<Integer> queue = new PriorityQueue<>(20, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        queue.offer(4);
//        queue.offer(3);
//        queue.offer(1);
//        queue.offer(100);
//        queue.offer(7);
//
////        for(Integer i : queue){
////            System.out.println(i);
////        }
//
//        while(true){
//            Integer v = queue.poll();
//
//            if(v == null)
//                break;
//            System.out.println(v);
//
//        }
    }
}
