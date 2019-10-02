package test.leecode;

import java.util.ArrayList;
import java.util.List;

/*
    给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

    例如，给出 n = 3，生成结果为：

            [
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"
            ]

*/

public class test_22 {

    public static final void findKH(List<String> ret, String val, int left, int right, int max){

        if(val.length() == max * 2){
            ret.add(val);
            return;
        }

        if(left < max){
            findKH(ret, val + "(", left + 1, right, max);
        }

        if(right < left){
            findKH(ret, val + ")", left, right + 1, max);
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        findKH(list, "", 0, 0, 3);
        System.out.println(list);
    }
}
