package test.leecode;


/*
给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。

        示例 1:

        输入: "(()"
        输出: 2
        解释: 最长有效括号子串为 "()"
        示例 2:

        输入: ")()())"
        输出: 4
        解释: 最长有效括号子串为 "()()"

*/

import java.util.TreeSet;

public class test_32 {

    public static final int findCount(String str){
        int leftCount = 0;
        int rightCount = 0;
        int leftIndex = -1;
        int maxCount = 0;

        TreeSet<Integer> max = new TreeSet<>();

        int len = str.length();

        for(int i = 0 ; i < len ; i ++){
            char c = str.charAt(i);

            if(c == '('){
                leftCount++;
                if(leftIndex == -1){
                    leftIndex = i;
                }
            }

            if(c == ')'){
                rightCount++;

                if(rightCount <= leftCount){
//                    int count = i - leftIndex + 1;
//                    if(count > maxCount){
//                        maxCount = count;
//                    }

                    maxCount += 2;
                    max.add(maxCount);
                }else if(rightCount > leftCount){
                    max.add(maxCount);
                    maxCount = 0;
                    leftIndex = -1;
                    leftCount = 0;
                    rightCount = 0;
                }
            }
        }

        return max.pollLast();
    }

    public static void main(String[] args) {
        System.out.println(findCount("(()"));
        System.out.println(findCount(")()())"));
        System.out.println(findCount("()())()()()()"));
    }
}
