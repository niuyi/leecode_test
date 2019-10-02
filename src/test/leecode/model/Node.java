package test.leecode.model;

/**
 * Created by linniu on 2019/10/1.
 */
public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public void print(StringBuilder sb){
        if(sb == null){
            sb = new StringBuilder();
        }

        if(value >= 0){
            sb.append(value);
        }else {
            sb.append("head");
        }
        if(next != null){
            sb.append("->");
            next.print(sb);
        }else{
            System.out.println(sb.toString());
        }
//        StringBuilder sb = new StringBuilder();
//        sb.append(value).append("->");
//
//        Node next = this.next;
//
//        while(next != null){
//            sb.append(next.value).append("->");
//            next = next.next;
//        }
//
//        System.out.println(sb.toString());
    }

    public static final Node create(int[] nums){
        Node pre = null;
        Node head = null;

        for(int i : nums){
            Node n = new Node(i);
            if(pre != null){
                pre.next = n;
            }

            pre = n;

            if(head == null){
                head = pre;
            }
        }

        return head;
    }
}
