package test.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linniu on 2019/10/2.
 */

//
//    给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//
//    例如，给出 n = 3，生成结果为：
//
//            [
//            "((()))",
//            "(()())",
//            "(())()",
//            "()(())",
//            "()()()"
//            ]
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/generate-parentheses
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

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
